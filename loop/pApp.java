public class pApp
{
	public static void main(String x[])
	{
	int i,j;
	int n=6,m=5;
	int num=1;
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=m-i;j++)
			{
					System.out.print("  "+ num);
					num++;
			}
		System.out.println(" ");
		}
	}
}