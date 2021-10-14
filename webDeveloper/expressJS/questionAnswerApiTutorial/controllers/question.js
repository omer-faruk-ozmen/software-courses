const Question = require("../models/question");

const CustomError = require("../helpers/error/CustomError")
const asyncErrorWrapper = require("express-async-handler");


const askNewQuestion = asyncErrorWrapper(async(req, res, next) => {
    const information = req.body;
    const question = await Question.create({
        ...information,
        user: req.user.id
    });

    res.status(200)
        .json({
            success: true,
            data: question
        })
});

const getAllQuestions = asyncErrorWrapper(async(req, res, next) => {
    //console.log(req.query.search)
    let query = Question.find();
    const populate = true;
    const populateObject = {
            path: "user",
            select: "name profile_image"
        }
        //Search
    if (req.query.search) {
        const searchObject = {} //title searchValue

        const regex = new RegExp(req.query.search, "i")

        searchObject["title"] = regex;

        query = query.where(searchObject);

    }
    //Populate
    if (populate) {
        query = query.populate(populateObject);
    }
    //Pagination
    const page = parseInt(req.query.page) || 1;
    const limit = parseInt(req.query.limit) || 5;
    //1 2 3 4 5 6 7 8 9 10
    //skip(0) 2.den başlar
    //limit(2) 2.den sonra 2 tane getirir
    // örnek page =1 , limit = 5 / startIndex 0 , endIndex 5
    const endIndex = page * limit;
    const startIndex = (page - 1) * limit;

    const pagination = {};
    const total = await Question.countDocuments();

    if (startIndex > 0) {
        pagination.previous = {
            page: page - 1,
            limit: limit
        }
    }
    if (endIndex < total) {
        pagination.next = {
            page: page + 1,
            limit: limit
        }
    }
    query = query.skip(startIndex).limit(limit);

    //Sort: req.query.sortBy most-answered most-liked
    const sortKey = req.query.sortBy;
    if (sortKey === "most-answered") {
        query = query.sort("-answerCount -createdAt")
    }
    if (sortKey === "most-liked") {
        query = query.sort("-likeCount -createdAt")
    } else {
        query = query.sort("-createdAt")
    }

    const questions = await query
        // const questions = await Question.find().where({
        //     title: "Questions 3 - Title"
        // });
    return res.status(200)
        .json({
            success: true,
            count: questions.length,
            pagination: pagination,
            data: questions
        })
});
const getSingleQuestion = asyncErrorWrapper(async(req, res, next) => {
    const { id } = req.params;
    const question = await Question.findById(id);


    return res.status(200)
        .json({
            success: true,
            data: question
        })

});
const editQuestion = asyncErrorWrapper(async(req, res, next) => {
    const { id } = req.params;

    const { title, content } = req.body;

    let question = await Question.findById(id);

    question.title = title;
    question.content = content;

    question = await question.save();

    return res.status(200)
        .json({
            success: true,
            data: question
        })

});
const deleteQuestion = asyncErrorWrapper(async(req, res, next) => {
    const { id } = req.params;

    await Question.findByIdAndDelete(id);

    res.status(200)
        .json({
            success: true,
            message: "Question delete operation successful"
        })

});
const likeQuestion = asyncErrorWrapper(async(req, res, next) => {
    const { id } = req.params;

    const question = await Question.findById(id);

    //Like
    if (question.likes.includes(req.user.id)) {
        return next(new CustomError("You already liked this question", 400))
    }
    question.likes.push(req.user.id);
    question.likeCount = question.likes.length;

    await question.save();
    return res.status(200)
        .json({
            success: true,
            data: question
        })
});
const undoLikeQuestion = asyncErrorWrapper(async(req, res, next) => {
    const { id } = req.params;

    const question = await Question.findById(id);

    //undoLike
    if (!question.likes.includes(req.user.id)) {
        return next(new CustomError("You can not undo like operation for this question", 400))
    }

    const index = question.likes.indexOf(req.user.id);
    question.likes.splice(index, 1);
    question.likeCount = question.likes.length;

    await question.save();
    return res.status(200)
        .json({
            success: true,
            data: question
        })
});


module.exports = { askNewQuestion, getAllQuestions, getSingleQuestion, editQuestion, deleteQuestion, likeQuestion, undoLikeQuestion }