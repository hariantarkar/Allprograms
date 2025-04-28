public class pat3
{
public static void main(String x[])
{
int i,j,no=1;
char ch='A',cha='a';
for(i=1;i<=5;i++)
{
   for(j=1;j<=i;j++)
   {
        if(i%2==1)
	{
	System.out.print(ch+" " );
	}
	else
	{
	System.out.print(cha+" ");
	}
   }
	ch++;
	cha++;
    System.out.println();
}
}
}




