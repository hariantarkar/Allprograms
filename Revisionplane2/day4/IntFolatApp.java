import java.util.*;
class IntFolatApp
{
	public static void main(String p[])
	{
		int a,b;
		float c,d,x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two integer no :");
		a=sc.nextInt();
		b=sc.nextInt();

		System.out.println("enter two floating   no :");
		c=sc.nextFloat();
		d=sc.nextFloat();
		int sum=a+b;
		int diff=a-b;

		x=c+d;
		y=c-d;
		System.out.println(" "+sum+"   "+diff);
		System.out.println(" "+x+"   "+y);
	}
}
