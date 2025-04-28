class course
{
	private int cid;
	private String cname;
	private int duration;
	private int fees;

public void setid(int cid)
{
	this.cid=cid;
}
public int getid()
{
	return cid;
}
public void setName(String cname)
{
	this.cname=cname;
}
public String  getName()
{
	return cname;
}
public void setduration(int duration)
{
	this.duration=duration;
}
public int getduration()
{
	return duration;
}
public void setfees(int fees)
{
	this.fees=fees;;
}
public int getfees()
{
	return fees;
}
public void coursee()
{
System.out.println(getid()+" \t"+getName()+" \t"+getduration()+" \t"+getfees()+" \t");

}

}


