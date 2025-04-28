import java.util.*;
class intArray
{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];

void setValue()
{
	System.out.println("enter 5 no");
	for(int i=0;i<5;i++)
	{
	a[i]=sc.nextInt();
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
public class valueDisplay
{
	public static void main(String c[])
	{
	intArray intA=new intArray();
	intA.setValue();
	intA.showValue();
	}
}