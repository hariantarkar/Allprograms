import java.util.*;
public class mulitNo
{
	public static void main(String x[])
	{
	    int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		int temp=1;
		int i=0;
		System.out.println("enter the no");
	      a[i]=sc.nextInt();
		//	while(temp<=10)
	      for(temp=1;temp<=10;temp++)

		{
			System.out.println(" "+a[i]*temp);
			//temp++;
		}
	}
}