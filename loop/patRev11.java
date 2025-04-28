class patRev11
{
	public static void main(String x[])
	{
	int n=5,m=5;
	int i,j;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n-i;j++)
		{
		System.out.printf(" ");
		}
		for(j=1;j<=i;j++)
		{
		System.out.print("*");
		}
		System.out.println(" ");
	}
	}
}
		