import java.util.*;
public class DelArrayElement
{
	public static void main(String x[])
	{
	int a[]=new int[5];
	int i,j,count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a array  element:");
	for(i=0;i<a.length;i++)
	{
	a[i]=sc.nextInt();
	}
	System.out.println("enter value to deleted:");
	int value=sc.nextInt();
	for(i=0;i<a.length-count;i++)
	{
	if(value==a[i])
	{
		for(j=i;j<a.length-1-count;j++)
		{
		a[j]=a[j+1];
		}
	count++;
	i--;
	}
	}
	System.out.println("array is:");
	for(i=0;i<a.length-count;i++)
	{
	System.out.println(" "+a[i]);
	}
}
}





	


