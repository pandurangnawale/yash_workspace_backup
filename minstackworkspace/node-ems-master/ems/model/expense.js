const mongoose = require('mongoose');
const expenseSchema=mongoose.Schema({
    expenseId:{
        type:String,
        required:true
    },
    expenseName:{
        type:String,
        required:true
    },
    expenseAmount:{
        type:Number,
        required:true
    },
    created_at:{
        type:Date,
        default:Date.now
    },
    updated_at:{
        type:Date,
        default:Date.now
    },
})
const expense = mongoose.model('expense',expenseSchema);
module.exports=expense;