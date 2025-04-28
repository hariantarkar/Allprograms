import java.util.*;//package define
class Food//class declaer
{
	private int fid;//instance variable
	private String fname;
	private int fprice;
	private int fcategory;
public void setid(int fid)
{
this.fid=fid;
}
public int getid()//getter method
{
return fid;
}
public void setName(String fname)
{
this.fname=fname;
}
public String getName()
{
return fname;
}
public void setprice(int fprice)
{
this.fprice=fprice;
}
public int getprice()
{
return fprice;
}
public void setcat(int fcategory)
{
this.fcategory=fcategory;
}
public int getcat()
{
return fcategory;
}
}
class Display
{
Food food[];
public void setFood(Food []food)
{
this.food=food;
}
public void show()
{
System.out.println("id\tname\tprice\tcat:");
for(int i=0;i<food.length;i++)
{
System.out.println(food[i].getid()+"\t "+food[i].getName()+"\t "+food[i].getprice()+" \t"+food[i].getcat());
}
}
void BillWithoutGSTShow()
{
System.out.println("Bill without gst :");
for(int i=0;i<food.length;i++)
{
int temp=food[i].getprice()*food[i].getcat();
System.out.println(" : "+temp);
}
}
void BillWithGSTShow()
{
System.out.println("Bill with gst :");
for(int i=0;i<food.length;i++)
{
int temp1=food[i].getprice()*food[i].getcat()+((food[i].getprice()*food[i].getcat())*20)/100;
System.out.println(" "+temp1);
}
}
}


public class FoodApp
{
public static void main(String x[])
{
Scanner sc=new Scanner (System.in);
 Food f=new  Food();//object create
Food f1[]=new Food[2];//array of object
Display d1=new Display();// object create

do
{
System.out.println("1: Add food details:");
System.out.println("2: display food details:");
System.out.println("3 :display bill details:");
System.out.println("enter choice:");//user choice
int choice=sc.nextInt();
switch(choice)
{
case 1:
System.out.println("enter a fid and fname and price and category:");//user inpute
for(int i=0;i<f1.length;i++)
{
int id=sc.nextInt();//user input accept
sc.nextLine();
String name=sc.nextLine();
//sc.nextLine();
int price=sc.nextInt();
int cat=sc.nextInt();
//sc.nextInt();
f1[i]=new Food();//array of refrance
f1[i].setid(id);//set value
sc.nextLine();//carser nextLine
f1[i].setName(name);
f1[i].setprice(price);
f1[i].setcat(cat);
}
break;
case 2:
d1.setFood(f1);
d1.show();//call function
break;
case 3:
		do
		{
		System.out.println("1: will without gst:");
		System.out.println("2 :will with gst:");
		System.out.println("enter your choice:");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
		d1.BillWithoutGSTShow();
		break;
		case 2:
		d1.BillWithGSTShow();
		break;
		default :
		System.out.println("wrong choice:");
		}
		}while(true);
//break;
default :
System.out.println("wrong choice:");
}
}
while(true);
}
}






