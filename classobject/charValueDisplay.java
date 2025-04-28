import java.util.*;
class charArray
{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];

void setValue()
{
	System.out.println("enter 5 char");
	for(int i=0;i<5;i++)
	{
	a[i]=sc.nextChar();
	}
}
void showValue()
{
	System.out.println("given array is");
	for(int i=0;i<5;i++)
	{
	System.out.println(" "+a[i]);
	}
}
}
public class charValueDisplay
{
	public static void main(String c[])
	{
	charArray charA=new charArray();
	charA.setValue();
	charA.showValue();
	}
}