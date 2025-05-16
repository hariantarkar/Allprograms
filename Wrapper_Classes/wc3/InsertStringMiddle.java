/*3. Insert a String in the Middle of Another String Using StringBuilder
Problem:
Write a program that takes two strings and inserts the second string into
the middle of the first one using StringBuilder.
Example:
Input: first = "HelloWorld"
second = "Java"
Output: "HelloJavaWorld"*/
public class InsertStringMiddle
{
	public static void main(String x[])
	{
		String s="HelloWorld";
		String s1="java";
		int mid=s.length()/2;
		
		StringBuilder str=new StringBuilder(s);
		
		str.insert(mid,s1);
		System.out.println(str);
		
	}
}
