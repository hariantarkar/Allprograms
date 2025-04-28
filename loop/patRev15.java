class patRev15
{
	public static void main(String x[])
	{
	int n=8,m=8;
	int i,j;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
		System.out.print("*");
		}
		int space=2*(n-i);
		for(j=1;j<space;j++)
		{
		System.out.printf(" ");
		}
		for(j=1;j<=i;j++)
		{
		System.out.printf("*");
		}
	System.out.println(" ");
	}
	
	

	}
}
		