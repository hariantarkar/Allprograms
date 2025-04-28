public class p1
{
	
   public static void main(String x[])
   {	
    int i,j;
    for(i=1;i<=9;i++)
    {	
    char c = 'A';
	for(j=1;j<=5;j++)
	{
	if(j>=i&&i<6 ||j>=10-i && i>=5)
	{
	System.out.print(" "+c);
	c++;
				
	}
	else
	{	
	System.out.print("  ");
	}
			
        }
			
        System.out.println(" ");
	}
	}
}