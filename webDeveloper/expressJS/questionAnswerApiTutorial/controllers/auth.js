const User = require("../models/user")
const CustomError = require("../helpers/error/CustomError")
const asyncErrorWrapper = require("express-async-handler");
const { sendJwtToClient } = require("../helpers/authorization/tokenHelpers")
const { validateUserInput, comparePassword } = require("../helpers/input/inputHelpers");
const { validate } = require("../models/user");
const register = asyncErrorWrapper(async(req, res, next) => {
    //POST DATA

    const { name, email, password, role } = req.body;

    //Async, await
    const user = await User.create({
        name,
        email,
        password,
        role
    });
    sendJwtToClient(user, res);


});
const login = asyncErrorWrapper(async(req, res, next) => {
    const { email, password } = req.body;
    if (!validateUserInput(email, password)) {
        return next(new CustomError("Please check your inputs", 400))
    }

    const user = await User.findOne({ email }).select("+password");
    if (!comparePassword(password, user.password)) {
        return next(new CustomError("Please check your credentials", 400))
    }


    sendJwtToClient(user, res);
});

const getUser = (req, res, next) => {
    res.json({
        success: true,
        data: {
            id: req.user.id,
            name: req.user.name,
            role: req.user.role
        }
    })
}

module.exports = { register, login, getUser }