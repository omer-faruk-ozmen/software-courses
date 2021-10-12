const express = require("express");
const { getAccessToRoute, getAdminAccess } = require("../middlewares/authorization/auth")

const { checkUserExist } = require("../middlewares/database/databaseErrorHelpers")
const { getBlockUser, getDeleteUser } = require("../controllers/admin");


const router = express.Router();

//Block User
//Delete User

router.use([getAccessToRoute, getAdminAccess]);

router.get("/block/:id", checkUserExist, getBlockUser);
router.delete("/user/:id", checkUserExist, getDeleteUser)




module.exports = router;