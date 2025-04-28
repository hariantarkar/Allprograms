import java.util.*;//package define
class Book
{
	private String title ;
	private String author;//variable declear
    private double price;
	private String publisher;
    private int pyear;
public void setTitle(String title)//setter method
{
this.title=title;
}
public String getTitle()//geeter method
{
return title;
}
public void setAuthor(String author)
{
this.author=author;
}
public String getAuthor()
{
return author;
}
public void setPrice(double price)
{
this.price=price;
}
public double getPrice()
{
return price;
}
public void setPub(String publisher)
{
this.publisher=publisher;
}
public String getPub()
{
return publisher;
}
public void setPubYear(int pyear)
{
this.pyear=pyear;
}
public int getPubYear()
{
return pyear;
}
}
class A
{
	Book b;
	public void setBook(Book b)
	{
		this.b=b;
	}
	void show()//create function
	{
		System.out.println(b.getTitle()+"\t "+b.getAuthor()+" \t"+b.getPrice()+" \t"+b.getPubYear());
	}
	boolean isclasic()
	{
		boolean  flag=false;
		int temp=b.getPubYear();
		if(temp<2000)
		{
			flag=true;	
		}
		return flag;
	}
	void discount()
	{	
		double temp1;
		double temp2;
		boolean h=isclasic();
		if(h)
		{
		temp1=b.getPrice()*10/100;
		temp2=temp1-b.getPrice();
		System.out.println("discount price:"+temp1);
		System.out.println("with discount price:"+temp2);
		}
	}

}
public class pojoApp
{
	public static void main(String x[])//main
	{
		Scanner sc=new Scanner(System.in);//create ref
		System.out.println("enter book title and author and price  and publication year");
		String t=sc.nextLine();//accept input
		String au=sc.nextLine();
		double p=sc.nextDouble();
		int year=sc.nextInt();


		Book b1=new Book();
		b1.setTitle(t);
		b1.setAuthor(au);
		b1.setPrice(p);
		sc.nextLine();
		//b1.setPub(publi);
		b1.setPubYear(year);
 

		A a	=new A();
		a1.setBook(b1);
		System.out.println("title\t author\tprice\t publish year");
		a1.show();
		boolean z=a1.isclasic();
		if(z)
		{
			System.out.println(" "+z);
		}
		else
		{
			System.out.println(" book is clssic "+z);
		}
			a1.discount();//function call
		}
	}
}





