let express=require("express");
let app=express();
 app.get("/welcome",(req,res)=>{
	 res.send("we are working with web app using express");
	 res.end;
 });
 app.listen(3000,()=>{
	 console.log("server started successfully");
 });
 