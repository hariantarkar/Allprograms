let express=require("express");
let app=express();
app.get("/welcome",(req,res)=>{
	res.send("<input type='text' name='name'value='' style='width:400px;height:40px;'/><br><br><input type='text'name='pass'value='' style='width:400px;height:40px;'/><br><br><input type='submit' name='s' value='login'style='width:400px;height:40px;'/>");
	res.end();
    });
	app.listen(3000,()=>{
		console.log("server started....");
	});
	
	
			  