public class loops
{
	public static void main(String x[])
	{	
	int i,j;
	int n=6,m=5;
	int num=1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=6-i;j++)
			{
				if(i%2==0)
				{
					System.out.print("  "+ num);
					num++;
				}
				else
				{
					System.out.println(" ");
				}
					
			}
		System.out.println(" ");
		}
	}
}

