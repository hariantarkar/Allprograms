let express=require("express");

let path=require("path");

 let app=express();
 
 app.use(express.static("public"));
 
 let p=path.join(__dirname+"/public");
 console.log(p);
 
 app.get("/",(req,res)=>{
	 res.sendFile(p+"/demo.html");
 });
 app.listen(3000,(req,res)=>{
	 console.log("server started");
 });
 
