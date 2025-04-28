/* Write a java program to pass the array function name as findEvenOdd( ), then display the even and odd number in array.*/

import java.util.*;
public class findEvanOdd
{
	public static void main(String x[])
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");

		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		EvanOdd(a);
	}
		public static void EvanOdd(int b[])
		{
			System.out.println("Evan no is :");
			for(int i=0;i<b.length;i++)
			{
				if(b[i]%2==0)
				{
					System.out.println(b[i]+" ");
				}
			}
			System.out.println("Odd no is :");
			
			for(int i=0;i<b.length;i++)
			{
				if(b[i]%2!=0)
				{
					System.out.println(b[i]+" ");
				}
			}
		}
	}	
}

