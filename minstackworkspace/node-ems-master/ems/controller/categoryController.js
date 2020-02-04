var category = require('../model/category.js');

exports.getCategory=(req,res,next)=>{
    category.find(function(err,category){
        if(err){
            res.json(err);
        }else{
            res.json(category);
        }
    })
};

 exports.addCategories=(req,res,next)=>{
     let newCategory=new category({
         categoryId: req.body.categoryId,
         categoryName: req.body.categoryName,
         created_at:new Date,
         updated_at:new Date
        
     });
     newCategory.save((err,item)=>{
         if(err){
             res.json(err);
         }else{
             res.json({msg : "category added sucessfully"});
         }
     })
 };

 exports.updateCategory = (req,res,next)=>{
     category.findOneAndUpdate({
         "categoryId": req.body.categoryId
     },
     {
         $set:{
             categoryName:req.body.categoryName,
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

 exports.deleteCategory = (req,res,next)=>{
     category.remove({
         categoryId:req.params.id
     },
     function(err,sucess){
         if(err)
            res.json(err)
        else
        res.json(sucess)
     }
     )
 };
