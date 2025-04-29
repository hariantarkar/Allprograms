/* Find Least Common Multiple (LCM)
Description: Write a program to find
the least common multiple (LCM) of two
numbers.Input: a = 12, b = 15*/
import java.util.*;
public class LCM
{
	public static void main(String x[])
	{
		int a=12;
		int b=15;
		int gcd=1;
		
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i == 0 && b%i == 0)
			{
				gcd=i;
			}
		}
			int lcm= (a*b)/gcd;
		
			System.out.println("LCM of  " +a +" and "+ b +" is: "+ lcm);
	}
}




