import java.util.*;
public class markSum
{
	public static void main(String c[])
	{
		int a[]=new int[5];
		int sum=0,i;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
		System.out.println("enter 5 subject marks");
		a[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Total marks sum is:"+sum);

	}
}