import java.util.*;
class Add
{
	Scanner sc=new Scanner(System.in);
	int a,b;
void setvalue()
{	System.out.println("enter two value");
	a=sc.nextInt();
	b=sc.nextInt();
}
void showAdd()
{
	System.out.printf("addition is %d\n",a+b);
}	
}
public class AddApp
{
	public static void main(String x[])
	{
	Add ad=new Add();
	ad.setvalue();
	ad.showAdd();
	}
}








