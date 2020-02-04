var expense = require('../model/expense');

exports.getExpense=(req,res,next)=>{
    expense.find(function(err,expense){
        if(err){
            res.json(err);
        }else{
            res.json(expense);
        }
    })
};

 exports.addExpense=(req,res,next)=>{
     let newExpense=new expense({
        expenseId: req.body.expenseId,
        expenseName: req.body.expenseName,
        expeseAmount: req.body.expeseAmount,
         created_at:new Date,
         updated_at:new Date
        
     });
     newExpense.save((err,item)=>{
         if(err){
             res.json(err);
         }else{
             res.json({msg : "Expense added sucessfully"});
         }
     })
 };

 exports.updateExpense = (req,res,next)=>{
    expense.findOneAndUpdate({
         "expenseId": req.body.expenseId
     },
     {
         $set:{
            expenseName:req.body.expenseName,
             updated_at:new Date()
         }
     },
     function(err,result){
         if(err)
         res.json(err)
         else
         res.json({msg : "Record Updated Sucessfully"})
     })
 };

 exports.deleteExpense = (req,res,next)=>{
    expense.remove({
        expenseId:req.params.id
     },
     function(err,sucess){
         if(err)
            res.json(err)
        else
        res.json(sucess)
     }
     )
 };
