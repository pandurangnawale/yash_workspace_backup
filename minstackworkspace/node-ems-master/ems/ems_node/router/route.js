var express = require('express');
var router=express.Router();

var category=require('../controller/categoryController.js');

router.get('/categories', category.getCategory);
router.post('/addCategory',category.addCategories);

module.exports=router;