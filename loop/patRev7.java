class patRev7
{
	public static void main(String x[])
	{
	int n=9,m=5;
	int i,j;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=m;j++)
		{
			if(j>=i+1&&j<=10-i)
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
		