const express = require("express");
const dotenv = require("dotenv");
const connectDatabase = require("./helpers/database/connectDatabase")
const routers = require("./routers/index");
const customErrorHandler = require("./middlewares/errors/customErrorHandler")
const path = require("path")

//Environment Veriables
dotenv.config({
    path: "./config/env/config.env"
});

//MongoDb connections
connectDatabase();


//localhost:8080/api/questions
//localhost:8080/api/auth

const app = express();

//Express - Body Middleware
app.use(express.json());

const PORT = process.env.PORT;

//Routers Middleware
app.use("/api", routers);

//Error Middleware
app.use(customErrorHandler);

app.use(express.static(path.join(__dirname, "public")))

app.listen(PORT, () => {
    console.log(`App Started on ${PORT} : ${process.env.NODE_ENV}`)
});