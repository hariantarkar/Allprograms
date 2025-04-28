import java.util.*;
class PairsSumWithTarget
{
	public static void main(String x[])
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a arrays element ");
		   for(int i=0;i<a.length;i++)
		    {
				a[i]=sc.nextInt();
		    }
		System.out.println(" arrays element is :- ");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(" "+a[i]);
			}
			int target=8;
			add(a,target);

	}
}

		       void  add(int a[],int  target)
			{
				int count=0;
				for(int i=0;i<a.length;i++)
				{
					for(int j=i+1;j<a.length;j++)
					{
						if(a[i]+a[j]==target)
						{
							count++;

						}
					}
					
					
				}	
					System.out.println(" total pairs count is :"+count);
			}






	