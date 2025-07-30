import java.util.*;
public class FreqEle
{
	public static void main(String x[])
	{
		int a[]=new int[7];
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter element to be check frequency:");
		int ele=sc.nextInt();
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == ele )
			{
				count++;
			}	
		}
		System.out.println("Element "+ele+" present in: "+count);
		
		
	}
}

		