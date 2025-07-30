let express=require("express");
let path=require("path");
let bodyParser=require("body-parser");
let app=express();
app.use(express.static("public"));
app.use(bodyParser.urlencoded({extended:true}));

let p=path.join(__dirname+"/public");
app.get("/",(req,res)=>{
	res.sendFile(p+"/registerusepost.html");
});
app.post("/save",(req,res)=>{
	 let{name,email,contact}=req.body;
	 res.send(`name is ${name} <br> email is  ${email} contact ${contact}`);
});
app.listen(4000,(req,res)=>{
	console.log("server started");
});


