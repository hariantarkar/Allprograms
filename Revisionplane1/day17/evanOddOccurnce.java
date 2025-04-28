import java.util.*;
public class evanOddOccurnce
{
	public static void main(String c[])
	{
		int a[]=new int[5];
		int count=0,i,num;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
		System.out.println("enter 5 element");
		a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			if(a[i]%2==0)
			{
		        count++;
			}
		}
		System.out.println("Evan Number is Present in "+ count+" times");
	}
}