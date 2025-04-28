import java.util.*;
class Perfect
{
	Scanner sc=new Scanner(System.in);
	int no,sum=0,i;
void setValue()
{
	System.out.println("enter a no:");
	no=sc.nextInt();
}
void checkPerfect()
{
	for (i = 1; i < no; i++) 
	{
 
          if (no % i == 0)
	   {
            sum=sum+i;
	   }
	}
	if(sum==no)
	{
	System.out.println("No is perfect");
	}
	else
	{
	System.out.println("No is not perfect");
	}
}
}
public class PerfectNo
{
	public static void main(String x[])
	{
		Perfect p=new Perfect();
		p.setValue();
		p.checkPerfect();
	}
}




