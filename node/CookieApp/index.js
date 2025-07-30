let express=require("express");
let cookieParser=require("cookie-parser");
const bodyParser = require("body-parser");
let app=express();

app.use(express.static("public"));
app.use(bodyParser.urlencoded({extended:true}));
app.use(cookieParser("##22332233##"));

app.get("/",(req,res)=>{
 let cookiedata=req.cookies.u;
    if(cookiedata==undefined){
        res.render("login.ejs");
    }
    else{
          res.render("welcome.ejs");
 
    }
});
app.post("/setcookie",(req,res)=>{
    let {user,pass}=req.body;
    res.cookie("u",user,{maxAge:(1000*60)*60});
    res.cookie("u",pass,{maxAge:(1000*60)*60});

    res.render("welcome.ejs");

});

app.listen(3000,()=>{
    console.log("server started");
});

