class Team
{
	private player[] players;
 	private int tid;
	private String tname;
public void setid(int tid)
{
	this.tid=tid;
}
public int getid()
{
	return tid;
}
public void setName(String tname)
{
	this.tname=tname;
}
public String getName()
{
	return tname;
}
	public void setplayer(player players[])
	{
		this.players=players;
	}
		public void showplayers()
		{
			for(int i=0;i<players.length;i++)
			{
			System.out.println(players[i].getid()+"\t "+players[i].getName()+
			" \t"+players[i].getage()+" \t"+players[i].getrun());
			}
		}

}










