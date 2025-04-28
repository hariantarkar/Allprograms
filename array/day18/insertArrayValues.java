import java.util.*;
public class insertArrayValues
{
public static void main(String x[])
{
int a[]=new int[6];
int i;
Scanner sc=new Scanner(System.in);
System.out.println("enter a array  element:");
for(i=0;i<a.length-1;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter index and value:");
int index=sc.nextInt();
int value=sc.nextInt();
	for(i=a.length-2;i>=index;i--)
	{
	a[i+1]=a[i];
	}

	a[index]=value;
	System.out.println("array is:");
	for(i=0;i<a.length;i++)
	{
	System.out.println(" "+a[i]);
	}
}
}





	


