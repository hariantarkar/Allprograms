let http=require("http");
let server=http.createServer((req,res)=>{
	res.write("welcome in node invironment");
	res.end();
    });
	server.listen(3000,()=>{
		console.log("server started");
	});
	