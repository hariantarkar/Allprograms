public class charPat
{
public static void main(String x[])
{
	for(int i=1;i<=5;i++)
	{
	char ch='A';
	char chars='a';
	for(int j=1;j<=i; j++)
	{
	if(i%2==0)
	{
	System.out.print(ch+" ");
	ch++;
	}
	else
	{
	System.out.print(chars+" ");
	chars++;
	}
	}
	System.out.println();
	}
}
}