import java.util.*;
public class RotateMatrix90
{	
    public static void main(String x[])
     {
	    int a[][]=new int[2][3];
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter a element of matrix :");
	     for(int i=0;i<a.length;i++)
              {
		for(int j=0;j<a.length;j++)
		{	
		 a[i][j]=sc.nextInt();
		}
	      }
	   System.out.println("givan matrix :");
	   for(int i=0;i<a.length;i++)
           {
	     for(int j=0;j<a.length;j++)
	     {	

		   System.out.println(" "+a[i][j]);

	     }
	   }
     }
}
	

