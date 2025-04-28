class patRev2
{
	public static void main(String x[])
	{
	int n=5,m=5;
	int i,j;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=m;j++)
		{
			if(i>=j)
			{
			System.out.print("*");
			}
			else
			{
			System.out.print("-");
			}
		}
		System.out.println(" ");
	}
	}
}
		