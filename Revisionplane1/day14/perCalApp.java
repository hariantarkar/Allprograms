/*Q1.Write a java program to enter marks of five subjects and calculate total marks and percentage.*/

import java.util.*;
public class perCalApp
{
	public static void main(String x[])
	{
		int a[]=new int[5];
		int totalmarks=0;
		float per;
		
		Scanner  sc=new Scanner (System.in);
		System.out.println("enter a five subjects mark");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int j=0;j<a.length;j++)
			{
				totalmarks=totalmarks+a[j];
			}
			System.out.println("total is:"+totalmarks);
			per=totalmarks*100/500;
			System.out.println("percentage is:"+per);

	}
}