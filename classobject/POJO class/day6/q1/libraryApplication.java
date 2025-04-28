import java.util.*;
public class  libraryApplication
{
public static void main(String c[])
{
	Scanner sc=new Scanner(System.in);
	book b1[]=new book[2]; 
	bookInfo bi=new bookInfo();
	do
	{
	System.out.println("1: Add book details");
	System.out.println("2: Display all book Details:");
System.out.println("3: Display list all book given author");
	System.out.println("4: display list tital book");
	System.out.println("5: Display list count book lib");
System.out.println("6: display list accenssion book");
System.out.println("7: total price of book");
System.out.println("8: update book details  tital of book");
	System.out.println("9: Delete bookdetails by price");
	System.out.println("10: exit");
System.out.println("----enter your choice----");
	int choice=sc.nextInt();
	switch(choice)
	{
case 1:
	for(int i=0;i<b1.length;i++)
	{
	b1[i]=new book();
System.out.println("enter accenssion no  tital author name and price");
	b1[i].setaccenssion(sc.nextInt());
	b1[i].setTital(sc.next());
	b1[i].setAuthor(sc.next());
	b1[i].setName(sc.next());
	b1[i].setprice(sc.nextInt());	
	}
	bi.setbook(b1);	
break;

case 2:
	bi.setbook(b1);	
System.out.println("accenssion         tital        author      name       price ");
	System.out.println("---------------------------------------------------");
	bi.showbook();
	 System.out.println("-----------------------------");

	
break;
case 3:
	bi.setbook(b1);	
	System.out.println("BookNAME                Athor");
	System.out.println("-----------------------------");
	bi.showBookAuthor();
	 System.out.println("-----------------------------");
break;
case 4:
	bi.setbook(b1);	
	System.out.println("BookName     BookTiatl");
        System.out.println("-----------------------------");
	bi.showBookTital();
	 System.out.println("-----------------------------");
break;
case 5:
	bi.setbook(b1);	
	System.out.println(" Total Book library");
	System.out.println("-------------------");
	bi.showTotalBook();
	 System.out.println("-----------------------------");
break;
case 6:
	  bi.setbook(b1);
	  System.out.println("BookName      AccenssionNo");
	 System.out.println("-----------------------------");
	  bi.showListAccenssion();
	 System.out.println("-----------------------------");

break;
case 7:
	 bi.setbook(b1);
 	 System.out.println("Books Total Price");
	 System.out.println("-----------------------------");
	  bi.showcalprice();
	 System.out.println("-----------------------------");

	
break;
default:
	System.out.println("wrong choice");
	}
	}while(true);
     }
}





	










