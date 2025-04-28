import java.util.*;
public class updateArray
{
	public static void main(String x[])
	{
	int a[]=new int[5];
	Scanner sc=new Scanner(System.in);
	int i,rvalue,nvalue;
	System.out.println("enter 5 no");
	for(i=0;i<a.length;i++)
	    a[i]=sc.nextInt();
	System.out.println("enter replace value and new value");
	rvalue=sc.nextInt();
	nvalue=sc.nextInt();
	for(i=0;i<a.length;i++)	
	{
		if(rvalue==a[i])
		   a[i]=nvalue;
	}
	
        System.out.println(" ");
	for(i=0;i<a.length;i++)
	System.out.println(" "+a[i]);
	}
}




	
	