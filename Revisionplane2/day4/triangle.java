import java.util.*;
public class triangle
{	
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter triangle sides:");
		int  a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int p=(a+b+c)/2;
		double s=(double)Math.sqrt(p*(p-a)*(p-b)*(p-c));

		System.out.println("triangle area is:"+s);
		System.out.println("a is:"+a+"\n b is:"+b+"\n c is 	"+c);
	}
}
 