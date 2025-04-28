class patRev6
{
	public static void main(String x[])
	{
	int n=9,m=5;
	int i,j;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=m;j++)
		{
			if(i==j||j==6-i)
			{
			System.out.printf("*");
			}
			else
			{
			System.out.printf(" ");
			}
		}
		System.out.println(" ");
	}
	}
}
		