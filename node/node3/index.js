let express=require("express");
let bodyParser=require("body-parser");
let session=require("express-session");

let app=express();
app.use(express.static("public"));
app.set("view engine","ejs");

app.use(bodyParser.urlencoded({extended:true}));
app.use(session({
    secret:"ABC##$$123$$",
    resave:false,
    saveUninitialized:true
}));

app.get("/",(req,res)=>{
    res.render("login.ejs");
});
app.post("/validate",(req,res)=>{
    let {name,pass}=req.body;
    req.session.uname=name;
    req.session.upass=pass;
    res.send(`Username ${req.session.uname}<br><br>Password ${req.session.upass}`);
    

});
app.listen(3000,()=>{
    console.log("server started");
});
