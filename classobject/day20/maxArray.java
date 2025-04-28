import java.util.*;
 class maxNo
{
	int max;
	
void showMax(int b[])
{
	
		    for(int i=0;i<5;i++)
	         {
	            		if(b[i]>max)
				{
					max=b[i];
				}
		     }
				System.out.println("max value is "+max);
				
}
}

public class maxArray
{
	public static void main(String c[])
	{
		int a[]=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++)
	    	{
		    System.out.println("enter 5 element");
		      a[i]=sc.nextInt();
		}
		maxNo mx=new maxNo();
		mx.showMax(a);
	}
	
}
	

	
