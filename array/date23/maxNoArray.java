import java.util.*;
public class maxNoArray
{
	public static void main(String x[])
	{
		int a[]=new int[5];
		int i,max;
		Scanner sc=new Scanner(System.in);
			for(i=0;i<5;i++)
			{
			System.out.println("enter 5 no");
			a[i]=sc.nextInt();
			}
				max=a[0];
				for(i=0;i<5;i++)
				{
					if(a[i]>max)
					{
					max=a[i];
					}
				}
			System.out.println("Maximum No is"+max);
	}
}







