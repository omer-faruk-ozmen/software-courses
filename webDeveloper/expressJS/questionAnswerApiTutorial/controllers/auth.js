const User = require("../models/user")
const CustomError = require("../helpers/error/CustomError")
const register = async(req, res, next) => {
    //POST DATA
    const name = "Selman Özmen";
    const email = "selmanozmen@gmail.com";
    const password = "12345";


    //try - catch
    try {
        //Async, await
        const user = await User.create({
            name,
            email,
            password
        });

        res
            .status(200)
            .json({
                success: true,
                data: user
            });
    } catch (err) {
        //asenkton işlemlerde hatanın yakalanması için try catch bloğu kullan
        return next(err);
    }


};
const errorTest = (req, res, next) => {


    return next(new TypeError("Type Error Message", 400));


}

module.exports = { register, errorTest }