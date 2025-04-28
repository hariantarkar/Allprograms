import java.util.*;
class Duck
{
 	int n,rem;
	boolean flag=false;
void setNumber(int no)
{
	n=no;
}
void showDuck()
{
	while(n!=0)
	{
	rem=n%10;	
	n=n/10;
		if(rem==0)
		{
		 flag=true;
		 break;
		}
	}
	if(flag)
	{
	System.out.println("num is duck number");
	}
	else
	{
	System.out.println("num is not duck number");
	}

}
}
public class DuckNoCheck
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
	   	Duck d1=new Duck();
		d1.setNumber(no);
		d1.showDuck();
	}
}
		