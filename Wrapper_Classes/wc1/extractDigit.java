//extract digit from string calculate sum:
public class extractDigit
{
	public static void main(String x[])
	{
		String str="abc123mno456pqr";
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				int ascii=(int)ch;
				int num =ascii-48;
				sum=sum+num;
			}
			
		}
		System.out.println("sum of digit is:"+sum);
	}
}
