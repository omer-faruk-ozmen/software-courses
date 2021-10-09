const mongoose = require("mongoose");
const Schema = mongoose.Schema;
var bcrypt = require('bcryptjs');
const jwt = require("jsonwebtoken")
const UserSchema = new Schema({
        name: {
            type: String,
            required: [true, "Please provide a name"]
        },
        email: {
            type: String,
            required: [true, "Please provide a email"],
            unique: true, //mongodb de unique de mesaj yayınlanmaz
            match: [
                /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/,
                "Please provide a valid email"
            ]
        },
        role: {
            type: String,
            default: "user",
            enum: ["user", "admin"]
        },
        password: {
            type: String,
            minlength: [6, "Please provide a password with min lenght 6"],
            required: [true, "please provide a password"],
            select: false
        },
        createdAt: {
            type: Date,
            default: Date.now
        },
        title: {
            type: String
        },
        about: {
            type: String
        },
        place: {
            type: String
        },
        website: {
            type: String
        },
        profile_image: {
            type: String,
            default: "default.jpg"
        },
        blocked: {
            type: Boolean,
            default: false
        }

    })
    //UserSchema Methods
UserSchema.methods.generatedJwtFromUser = function() {
    const { JWT_SECRET_KEY, JWT_EXPIRE } = process.env;
    const payload = {
        id: this._id,
        name: this.name
    };
    const token = jwt.sign(payload, JWT_SECRET_KEY, {
        expiresIn: JWT_EXPIRE
    });
    return token;
}

//Pre Hooks
UserSchema.pre("save", function(next) {
    //Parola Değişmemişse
    if (!this.isModified("password")) {
        next();
    }

    bcrypt.genSalt(10, (err, salt) => {
        if (err) next(err);
        bcrypt.hash(this.password, salt, (err, hash) => {
            if (err) next(err);
            this.password = hash;
            next();
        });
    });
});

module.exports = mongoose.model("User", UserSchema);
//users
//user.create