import java.util.*;
class Perfect 
{
 int sum=0,i,num;
void setNum(int no)
{
 	num=no;
}
void checkPerfect()
{
	for(i=1;i<num;i++)
	{
		if(num%i==0)
		{
		sum=sum+i;
		}
	}
	if(sum==num)	
	{
	System.out.println("number is perfect");
	}
	else
	{
	System.out.println("number is not perfect");
	}

}
}
public class PrfectNoCheck
{
	public static void main(String x[])
	{
		Scanner sc=new 	Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		Perfect p1=new Perfect();
		p1.setNum(no);
		p1.checkPerfect();
	}
}