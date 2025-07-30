let express=require("express");
let app=express();

app.set("view engine","ejs");
app.use(express.static("public"));

app.get("/",(req,res)=>{
    res.render("demo.ejs",{
        name:"ram"
    });
});
app.listen(3000,()=>{
    console.log("server started");
});
