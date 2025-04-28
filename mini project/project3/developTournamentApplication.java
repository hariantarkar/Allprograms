import java.util.*;
public class  developTournamentApplication
{
public static void main(String c[])
{
	Scanner sc=new Scanner(System.in);
	Team tee=new Team();
	Team t[]=new Team[2];
	match sh=new match();
	player p1[]=new player[4];
	Tournament tur=new Tournament();
	do
	{
	System.out.println("1: Teams");
	System.out.println("2: player");
	System.out.println("3: match");
	System.out.println("4: view all teams");
	System.out.println("5:  view ");
	System.out.println("6: view team wise player list");
	System.out.println("7:  view team wise player run");
	System.out.println("8:  view winner ");


System.out.println("----enter your choice----");
	int choice=sc.nextInt();
	switch(choice)
	{
case 1:
	for(int j=0;j<t.length;j++)//3
	{
	t[j]=new Team();
System.out.println("enter team id and  name");
	//int teaid=;
	//String teaname=;
	t[j].setid(sc.nextInt());
	t[j].setName(sc.next());
	
	//}
	for(int i=0;i<p1.length;i++)
	{
	p1[i]=new player();
	System.out.println("enter players id and name and age and run");
	int id=sc.nextInt();
	sc.nextLine();
	String name=sc.nextLine();
	//sc.nextLine();
	int age=sc.nextInt();
	int run=sc.nextInt();
	p1[i].setid(id);
	p1[i].setName(name);
	p1[i].setage(age);
	p1[i].setrun(run);
	sc.nextLine();
	}
	}
	sh.setTeam(t);
	System.out.println(" id   name");
	sh.showTeam();
	tee.setplayer(p1);
	System.out.println("id        name           age       run");
	tee.showplayers();
break;

case 2:
	tee.setplayer(p1);
	System.out.println("id \t name \t age \t run");
	tee.showplayers();

	
break;

case 3:
	System.out.println("enter a over and id and match name and loaction :");
	int mover=sc.nextInt();
	int midee=sc.nextInt();	
	String  mnamee=sc.nextLine();
	String loct=sc.nextLine();
	sh.setover(mover);
	sh.setid(midee);
	sh.setName(mnamee);
	sh.setLocation(loct);
	sc.nextLine();
	
	tur.setmatch(sh);
	System.out.println("-------------> Match Details <--------------------");
	System.out.println("over    id    name     loaction");
	tur.showmatch();
	tur.setTeam(t);
	System.out.println("------------------> Match Teams <---------------------");
	System.out.println("id     name");
	tur.showTeam();
	System.out.println("------------------> Match players <---------------------");
	tur.setplayer(p1);
	System.out.println("id   name      age       run");
	tur.showplayers();
break;
case 4:	
	sh.setTeam(t);
	System.out.println("----------All Teams-------------");
	System.out.println("id     name");
	sh.showTeam();
break;
case 5:

	
break;
	
case 6:
	System.out.println("Team + Player");
	tur.setplayer123(p1,t);
break;
case 7:
	System.out.println("Team + Player Run");
	tur.setTeamRun(p1,t);

	
break;
case 8:
	System.out.println("--------------->Winner: <--------------");
	tur.setwinner(p1,t);
break;


default:
	System.out.println("wrong choice");
	}
	}while(true);
     }
}





	










