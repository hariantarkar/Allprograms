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

conn.query("insert into emp values('0',?,?,?,?)",["ram","ram@gmail.com","122345",1000],(err,result)=>{
	if(err)
	{
		console.log("record not save ");
		console.log(err);
	}
	else
	{
		console.log("record save success");
		console.log(result);
	}
});

