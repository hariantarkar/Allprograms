import java.util.*;
class RevNo
{
	Scanner sc=new Scanner(System.in);
	int rev=0,rem,no;
void setNo()
{
	System.out.println("enter a no");
	no=sc.nextInt();
}
void RevrseNo()
{	while(no!=0)
	{
	rem=no%10;
	no=no/10;
	rev=rev*10+rem;
	}
	System.out.println(" "+rev);
}
}
public class RevrseApp
{
	public static void main(String x[])
	{
		RevNo r=new RevNo();
		r.setNo();
		r.RevrseNo();
	}
}






