var bodyparser=require('body-parser');
var express = require('express');
var mongoose = require('mongoose');

var app = express();
app.use(bodyparser.json());

var routes=require('./router/route.js');

app.listen(3004);
console.log("server connected");

mongoose.connect('mongodb://localhost:27017/expenselist',{
    useNewUrlParser:true,
    useUnifiedTopology:true
});

mongoose.connection.on('connected',()=>{
    console.log('connected with port 27017');
});
mongoose.connection.on('error',(error)=>{
    console.log(error);
});

app.use('/',routes);
module.exports=app;