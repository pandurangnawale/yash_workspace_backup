const mongoose = require('mongoose');
const categorySchema=mongoose.Schema({
    categoryId:{
        type:String,
        required:true
    },
    categoryName:{
        type:String,
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
const category = mongoose.model('category',categorySchema);
module.exports=category;