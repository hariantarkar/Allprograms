import java.util.*;
class primeNo
{
     int i,num,count=0;
void setNo(int no)
{
	
	num=no;
}
void showPrimeNo()
{	
	for(i=1;i<=num;i++)
	{
		if(num%i==0)
		{
		count++;
		}
	}
	if(count==2)
	{
	 	System.out.println("no is prime number");
	}
	else
	{
		 System.out.println("no is not prime number");
	}


}
}
public class PrimeNoCheck
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		primeNo pn=new primeNo();
		pn.setNo(no);
		pn.showPrimeNo();
	}
}
