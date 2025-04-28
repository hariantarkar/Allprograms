public class pat2
{
public static void main(String x[])
{
int i,j,no=1;
char ch='a';
for(i=1;i<=5;i++)
{
   for(j=1;j<=i;j++)
   {
        if(i%2==1)
	{
	System.out.print(ch+" " );
	}
	ch++;
	else
	{
	System.out.print(no+" ");
	no++;
	}
   }
    System.out.println();
}
}
}




