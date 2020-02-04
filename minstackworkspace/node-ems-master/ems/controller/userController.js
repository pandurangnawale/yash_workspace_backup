var user = require('../model/user.js');

exports.getUser=(req,res,next)=>{
    user.find(function(err,user){
        if(err){
            res.json(err);
        }else{
            res.json(user);
        }
    })
};

 exports.addUser=(req,res,next)=>{
     let newUser=new user({
        Id: req.body.Id,
        userName: req.body.userName,
        userPassword:req.body.userPassword,
        userPhone:req.body.userPhone,
        email:req.body.email,
        role:req.body.role,
        status:req.body.status,
        created_at:new Date,
        updated_at:new Date        
     });
     newUser.save((err,item)=>{
         if(err){
             res.json(err);
         }else{
             res.json({msg : "user added sucessfully"});
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
