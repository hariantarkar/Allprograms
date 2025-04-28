class Tournament
{
	private match match;
	private Team Teams[];
	private player players[];
public void setmatch(match match)
{
	this.match=match;
}
public void showmatch()
{
System.out.println(match.getover()+" \t"+match.getmid()+" \t"+match.getName()+" \t"+match.getLocation()+" \t");
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

public void setplayer(player players[])
{
	this.players=players;
}
public void showplayers()
{
for(int i=0;i<players.length;i++)
{
System.out.println(players[i].getid()+"\t "+players[i].getName()+" \t"+players[i].getage()+" \t"+players[i].getrun());
}


}
public void setplayer123(player players[],Team Teams[])
{

	this.players=players;
	this.Teams=Teams;

for(int i=0;i<Teams.length;i++)
{
	System.out.println(Teams[i].getid()+" \t"+Teams[i].getName());
	System.out.println("---------------------------------------------------");
for(int j=0;j<players.length;j++)
{
System.out.println(players[j].getid()+"\t "+players[j].getName()+" \t"+players[j].getage()+" \t"+players[j].getrun());
}
}
}
public void setTeamRun( player players[],Team Teams[])
{
	

	this.players=players;
	this.Teams=Teams;

for(int i=0;i<Teams.length;i++)
{
	System.out.println(Teams[i].getid()+" \t"+Teams[i].getName());
	System.out.println("---------------------------------------------------");
for(int j=0;j<players.length;j++)
{
System.out.println(players[j].getName()+" \t"+players[j].getrun());
}
}
}
public void setwinner( player players[],Team Teams[])
{
	

	this.players=players;
	this.Teams=Teams;
	int count=0;
for(int i=0;i<Teams.length;i++)
{
	System.out.println(Teams[i].getid()+" \t"+Teams[i].getName());
	System.out.println("---------------------------------------------------");

for(int j=0;j<players.length;j++)
{
	//System.out.println(players[j].getrun());

	{
	count=count+players[j].getrun();
	}
System.out.println("total run"+count);

}

}
}
}




