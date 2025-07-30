let jwt=require("jsonwebtoken");
const secretKey="abcd12345";

const token=jwt.sign({
	id:1,
	username:"Hari"
    },secretKey,{expiresIn:'1h'});
	
	console.log(token);
	jwt.verify(token,secretKey,(err,decoded)=>{
		if(err){
			console.log("invalid token ");
		}
		else{
			console.log("\n token verifyed  "+decoded.id);
		}
	});
	