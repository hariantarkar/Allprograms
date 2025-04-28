import java.util.*;
class book
{
	private String bookname;
	private String 	booktital;
	private int bookprice;
	private int books;

public void setbookName(String n)
{
	bookname=n;
}
public String getbookName()
{
	return bookname;
}
public void setbookTital(String c)
{
	booktital=c;
}
public String getbookTital()
{
	return booktital;
}
public void setbookprice(int p)
{
	bookprice=p;
	books=bookprice+(bookprice*10)/100;
	
}
public int getbookprice()
{
	return bookprice;
}
public int getbooksprice()
{
	return books;
}
}
class BookDetails
{
	private book bk;
void setemployee(book b)
{
	 bk=b;
}
void showBookD()
{		
	System.out.println("bookk name"+bk.getbookName());
	System.out.println("book tital name"+bk.getbookTital());
	System.out.println("book before discount price"+bk.getbookprice());
	System.out.println("book after discount price"+bk.getbooksprice());

}
}
public class bookApp
{
public static void main(String x[])
{
	Scanner sc=new Scanner(System.in);

	book b1=new book();	
	System.out.println("enter book name");
	String name=sc.nextLine();
	b1.setbookName("name");

	System.out.println("enter book tital");
	String tital=sc.nextLine();
	b1.setbookTital("tital");

	System.out.println("enter book price");
	int no=sc.nextInt();
	b1.setbookprice(no);

	BookDetails d1=new BookDetails();
	d1.setemployee(b1);
	d1.showBookD();

}
}








