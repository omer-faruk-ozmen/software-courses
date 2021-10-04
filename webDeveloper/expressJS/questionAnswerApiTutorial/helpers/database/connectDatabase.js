const mongoose = require("mongoose");


const connectDatabase = () => {

    const URI = process.env.MONGO_URI;

    mongoose.connect(URI, { useNewUrlParser: true })
        .then(() => {
            console.log("MongoDb Connection Successful");
        })
        .catch(err => {
            console.error(err);
        })

}

module.exports = connectDatabase;