import java.util.*;
public class OccuranceApp
{
	public static void main(String x[])
	{
		int a[]=new int[5];
		int i,j,temp,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 elements");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
			for(i=0;i<a.length;i++)
			{
				for(j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			for(i=0;i<a.length;i++)
			{
				for(j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
						count++;
					else
					{	
						System.out.println(" "+a[i]+"Times "+count);
					count=1;
					}
				}
			}
	}
}









