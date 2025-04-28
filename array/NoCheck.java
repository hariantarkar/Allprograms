import java.util.*;
public class  NoCheck
{
	public static void main(String c[])
	{
		int a[]=new int[5];
		int flag=0,i,num;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
		System.out.println("enter 5 element");
		a[i]=sc.nextInt();
		}
		System.out.println("enter no to be check");
		num=sc.nextInt();
		for(i=0;i<5;i++)
		{
			if(a[i]==num)
			{
		        flag=1;
			  break;
			}
		}
			if(flag==0)
			{
			System.out.println(" "+num+" num is not present");
			}
			else
			{
			System.out.println(" "+num+" num is present ");
			}
  	}
}