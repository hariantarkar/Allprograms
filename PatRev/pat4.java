public class pat5
{
public static void main(String x[])
{
int i,j,no=1;

for(i=1;i<=5;i++)
{
   for(j=1;j<=5;j++)
   {
        if( i==j || i+j==6 )
	{
	System.out.print(no);
	}
	else
	{
	System.out.print(" ");
	}
   }no++;
    System.out.println();
}
}
}




