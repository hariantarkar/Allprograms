import java.util.*;
public class InstituteManagementApplication 
{
	public static void main(String x[])
	{
	Scanner sc=new Scanner (System.in);
	
	do
	{
	System.out.println("1: course");
	System.out.println("2: inquiry");
	System.out.println("3:  batch");
	System.out.println("______enter your choise_______");
	int choice=sc.nextInt();
	switch(choice)
	{
case 1:
	course co=new course();
	System.out.println("enter cid and cname and cduration and cfees");
	int id=sc.nextInt();
	String name=sc.nextLine();
	sc.nextLine();
	int dur=sc.nextInt();
	int fee=sc.nextInt();
	co.setid(id);
	co.setName(name);
	co.setduration(dur);
	co.setfees(fee);
	sc.nextLine();
	System.out.println("--------------course information--------------");
	System.out.println("id   name  duration   fees");
	co.coursee();
break;
case 2:
	enquiry e1=new enquiry();	
	System.out.println("enter id and name and email and contact ");
	int i=sc.nextInt();
	String  n=sc.nextLine();
	String em=sc.nextLine();
	sc.nextLine();
	int cont=sc.nextInt();
	e1.setid(i);
	e1.setName(n);
	e1.setEmail(em);
	sc.nextLine();
	e1.setcontact(cont);
	sc.nextLine();
	System.out.println("-----------qnuiry details-------------");	
System.out.println(e1.getid()+" \t"+e1.getName()+" \t"+e1.getEmail()+" \t"+e1.getcontact()+" \t");

	course cosr1=new course();
	//course course=course.getCourses();
System.out.println("---------course details----------");
	e1.showcoursee();
	System.out.println("-----------qnuiry details-------------");	
System.out.println(e1.getid()+" \t"+e1.getName()+" \t"+e1.getEmail()+" \t"+e1.getcontact()+" \t");
	
break;
case 3:
	batch b1=new batch();
	System.out.println("enter bid and startdate and enddate and batchname ");
	int baid=sc.nextInt();
	int startda=sc.nextInt();
	int endda=sc.nextInt();
	String nam=sc.nextLine();
	b1.setbid(baid);
	b1.setstartdate(startda);
	b1.setenddate(endda);
	b1.setBatchName(nam);
	sc.nextLine();
	b1.show();	
break;
	
case 4:	
break;	
case 5:
	sc.nextLine();
	System.out.println("call for confirmation");
	String 
break;

	default:
	System.out.println("you enter wrong choice");
	}
	}while(true);
	}
}




