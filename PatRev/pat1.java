public class pat1
{
public static void main(String x[])
{
int i,j;
for(i=1;i<=5;i++)
{
   for(j=1;j<=5;j++)
   {
        if(j>=6-i)
	{
	System.out.print( i );
	}
	else
	System.out.print(" ");
   }
    System.out.println();
}
}
}