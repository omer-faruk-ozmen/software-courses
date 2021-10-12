const express = require("express");
const { getAccessToRoute, getAdminAccess } = require("../middlewares/authorization/auth")

const { checkUserExist } = require("../middlewares/database/databaseErrorHelpers")
const { getBlockUser } = require("../controllers/admin");


const router = express.Router();

//Block User
//Delete User

router.use([getAccessToRoute, getAdminAccess]);

router.get("/block/:id", checkUserExist, getBlockUser);
router.get("/", (req, res, next) => {
    res.status(200).json({
        success: true,
        message: "Admin Page"
    })
});



module.exports = router;