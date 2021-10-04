const express = require("express");
const { accessControl, defaultMiddleware } = require("./middleware")

const users = [
    { id: 1, naem: "Ömer Faruk Özmen", place: "Kars" },
    { id: 2, naem: "Serhat Say", place: "İstanbul" }
]

const app = express();

const PORT = 8080;
//app.use(accessControl); //tüm url lerde kullanılır.
app.use(defaultMiddleware, express.json());
//Get Request

//localhost:8080/users
//Belli bir alanda kontrol için
app.get("/users", accessControl, (req, res, next) => {
    res.json(users)
});
app.get("/products", (req, res, next) => {
    res.json("Products")
});
app.post("/users", (req, res, next) => {

    const user = req.body;
    users.push(user)
    res.json({
        success: true,
        data: users
    })
});
app.put("/users/:id", (req, res, next) => {
    const id = parseInt(req.params.id);
    for (let i = 0; i < users.length; i++) {
        if (users[i].id === id) {
            users[i] = {
                ...users[i],
                ...req.body
            };

        }
    }
    res.json({
        success: true,
        data: users
    })
});
app.delete("/users/:id", (req, res, next) => {
    const id = parseInt(req.params.id)
    for (let i = 0; i < users.length; i++) {
        if (users[i].id === id) {
            users.splice(i, 1);

        }
    }
    res.json({
        success: true,
        data: users
    })
});


app.listen(PORT, () => {
    console.log("Server Started: " + PORT)
});