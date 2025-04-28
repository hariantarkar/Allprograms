class enquiry
{
	private int id;
	private String name;
	private String email;
	private int contact;
	//private String edu;
	//private boolean status;
public void setid(int id)
{
	this.id=id;
}
public int getid()
{
	return id;
}
public void setName(String name)
{
	this.name=name;
}
public String  getName()
{
	return name;
}
public void setEmail(String email)
{
	this.email=email;
}
public String getEmail()
{
	return email;
}
public void setcontact(int contact)
{
	this.contact=contact;
}
public int getcontact()
{
	return contact;
}
private course coursee;
public void setCourse(course coursee)
{
	this.coursee=coursee;
}
	public void showcoursee()
	{
	System.out.println("---------course details----------");
	System.out.println(coursee.getid()+" \t"+coursee.getName()+
	" \t"+coursee.getduration()+" \t"+coursee.getfees()+" \t");
	}
}






