const User = require("../models/user")
const CustomError = require("../helpers/error/CustomError")
const asyncErrorWrapper = require("express-async-handler");
const sendJwtToClient = require("../helpers/authorization/sendJwtToClient")

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
    sendJwtToClient(user, res)


});
const errorTest = (req, res, next) => {


    return next(new TypeError("Type Error Message", 400));


}

module.exports = { register, errorTest }