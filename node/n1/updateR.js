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

conn.query("update emp set name=?,sal=? where id=?",["nik",40000,3],(err,result)=>{
	if(err)
	{
		console.log("record not save ");
		console.log(err);
	}
	else
	{
		if(result.affectedRows>0)
		{
		console.log("record updated success");
		console.log(result);
		}
		else{
			console.log("some problem is there");
		}
		
	}
});

