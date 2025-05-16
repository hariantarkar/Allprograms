//WAP to input two strings and compare it without using inbuilt functions?
public class CompareString
{
	public static void main(String x[])
	{
		String str="ram";
		String s="ram";
		
		if(str.length()!=s.length())
		{
			System.out.println("String not equal");
		}
		else
		{
			boolean flag=true;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)!=s.charAt(i))
				{
					flag=false;
					break;
				}
			}
			
				if(flag)
				{
					System.out.println("string is equal:");
				}
				else{
					System.out.println("string is equal:");
				}
			
		}
	}
}
