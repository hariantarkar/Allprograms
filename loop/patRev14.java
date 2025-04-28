class patRev14
{
	public static void main(String x[])
	{
	int n=5,m=5;
	int i,j;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			if( (i+j)%2==0)
			{
			System.out.print("1");
			}
			else
			{
			System.out.print("0");
			}
		}
		System.out.println(" ");
	}
	}
}
		