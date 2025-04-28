public class pat //class define
{
    public static void main(String x[])//main function
    {
     int i,j,num=1,n=5,k=5;/variable initilize
    for(i=1;i<=n;i++)//outer loop
    {
        for(j=1;j<=k;j++)//inner loop
        {
			if(j<=6-i )
			{
				System.out.print(num+" ");//output statement
			}
			num++;
        }
			System.out.println(" ");
			num=1;
	}
		for(i=2;i<=n;i++)
		{
			for(j=1;j<=k;j++)
			{
				if(j<=i)
				{
					System.out.print(num+" ");
				}
					num++;
			}
				System.out.println(" ");
				num=1;
		}
	}
}
