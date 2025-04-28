class match
{
	private Team Teams[];
		private Team Team;
	private int over;
	private int mid;
	private String matchname;
	private String location;
public void setover(int over)
{
	this.over=over;
}
public int getover()
{
	return over;
}
public void setid(int mid)
{
	this.mid=mid;
}
public int getmid()
{
	return mid;
}
public void setName(String matchname)
{	
	this.matchname=matchname;
}
public String getName()
{
	return matchname;
}
public void setLocation(String location)
{
	this.location=location;
}
public String getLocation()
{
	return location;
}
public void setTeam(Team Teams[])
{
	this.Teams=Teams;
}
public void showTeam()
{
for(int i=0;i<Teams.length;i++)
{
System.out.println(Teams[i].getid()+" \t"+Teams[i].getName());
}
}
public void setTe(Team Team)
{
	this.Team=Team;
}
public void showTe()
{
System.out.println(Team.getid()+" \t"+Team.getName());
}

}




