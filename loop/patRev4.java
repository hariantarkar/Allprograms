class patRev4
{
	public static void main(String x[])
	{
	int n=5,m=5;
	int i,j;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			if(i%2==0)
			{
			System.out.printf("%c",64+j);
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
		