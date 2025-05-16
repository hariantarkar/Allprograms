class patRev10
{
	public static void main(String x[])
	{
	int n=5,m=5;
	int i,j;
	for(i=n;i>=1;i++)
	{
		for(j=1;j<=m;j++)
		{
			if(j>=i)
			{
			System.out.print("*");
			}
			else
			{
			System.out.print(" ");
			}
		}
		System.out.println(" ");
	}
	}
}
		