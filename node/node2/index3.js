let express=require("express");
require("dotenv").config();
let app=express();
let port=process.env.PORT;
let dbname=process.env.DB_NAME;
let dbpass=process.env.DB_PASS;
let dbhost=process.env.DB_HOST;
let dbuser=process.env.DB_USER;



app.listen(port,()=>{
    console.log("server started");
    console.log("username is  "+dbuser);
    console.log("password is  "+dbpass);
    console.log("host is   "+dbhost);
    console.log("dbname is   "+dbname);

});
