import java.util.*;
public class oddNoIndex
{
	public static void main(String x[])
	{
		int a[]=new int[5];
		int index=0;
		Scanner sc=new Scanner(System.in);
			for(index=0;index<5;index++)
			{
			System.out.println("enter  no");
			a[index]=sc.nextInt();
			}
				
			      	for(index=0;index<a.length;index++)
					{
					if(a[index]%2==1)
					System.out.println("odd no index"+a[index]);
					}
	}
}
					