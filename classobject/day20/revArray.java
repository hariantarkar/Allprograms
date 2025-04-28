import java.util.*;
class arrayNumRev
{
	int i,j,temp;
void showRevArray(int a[])
{
	System.out.print("given array");
			for(i=0;i<5;i++)
	      	System.out.print("\t"+a[i]);
			
			for(i=0,j=a.length-1;i<a.length/2;i++,j--)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		System.out.print("revers array is\n");
		for(i=0;i<5;i++)
		{
		System.out.print("\t"+a[i]);
		}
}
}
public class revArray
{

	public static void main(String x[])
	{
		int b[]=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
			for(i=0;i<5;i++)
			  {
				System.out.println("enter  5 element");
				b[i]=sc.nextInt();
			  }
			arrayNumRev rev=new arrayNumRev();
			rev.showRevArray(b);
			
	}
}
		
