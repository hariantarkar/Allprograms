/*Example: WAP to input string is anagram or not
Input :  abcd
Input:   bacd
Output: anagram*/
import java.util.*;
public class TestAnagram
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first string:");
		String first=sc.nextLine();
		System.out.println("enter a second string :");
		String second=sc.nextLine();
		
		if(first.length()!=second.length())
		{
			System.out.println("Not anagram:");
		}
		else
		{
			int f[]=new int[26];
			for(int i=0;i<first.length();i++)
			{
				f[first.charAt(i)-'a']++;
				f[second.charAt(i)-'a']--;
			}
			boolean flag=true;
			for(int i=0;i<f.length;i++)
			{
				if(f[i]!=0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println("String is anagram:");
			}
			else
			{
				System.out.println("string not anagram:");
			}
		}
	}
}


				

