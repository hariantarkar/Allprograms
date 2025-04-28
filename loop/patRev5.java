class patRev5
{
	public static void main(String x[])
	{
	int n=9,m=5;
	int i,j;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=m;j++)
		{
			if(i>=j && i<=5 || j<=10-i && i>5)
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
		