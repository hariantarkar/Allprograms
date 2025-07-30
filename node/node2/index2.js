let express=require("express");
let bodyParser=require("body-parser");
let app=express();

app.set("views engine","ejs");
app.use(express.static("public"));
app.use(bodyParser.urlencoded({extended:true}));

app.get("/",(req,res)=>{
    res.render("login.ejs",{msg:""});
});

app.post("/save", (req, res, next)=>{
    let {user,pass}=req.body;
    console.log(user);
    if(user=="admin")
    {
        next();

    }
    else{
        res.render("login.ejs",{msg:"login failed"});
    }
});

app.post("/save",(req,res)=>{
    res.send("Request receiced");

});
app.listen(3000,(req,res)=>{
    console.log("server started");

    
});
