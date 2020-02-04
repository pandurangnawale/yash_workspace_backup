var express = require('express');
var router=express.Router();

var category=require('../controller/categoryController.js');
var expense=require('../controller/expenseController.js');
var user=require('../controller/userController.js');

router.get('/categories', category.getCategory);
router.post('/addCategory',category.addCategories);
router.put('/updateCategory',category.updateCategory);
router.delete('/deleteCategory',category.deleteCategory);

router.get('/expense', expense.getExpense);
router.post('/addExpense',expense.addExpense);
router.put('/updateExpense',expense.updateExpense);
router.delete('/deleteExpense',expense.deleteExpense);

router.get('/user',user.getUser);
router.post('/addUser',user.addUser);



module.exports=router;