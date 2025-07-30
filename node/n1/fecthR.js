let mysql=require("mysql2");

let conn=mysql.createConnection({
 host:"localhost",
 user:"root",
 password:"root",
 database:"first"
});
conn.connect((err)=>{
 if(err)
 {
 console.log("database is not connected");
 }
 else
 {
 console.log("database is connected");
 }
});

conn.query("select *from emp",(err,result)=>{
	if(err)
	{
		console.log("erorr is "+err);
		
	}
	else
	{
		result.forEach((row)=>{
			console.log(row.id+"\t"+row.name+"\t"+row.email+"\t"+row.contact+"\t"+row.sal);
		});
		
	}
});

