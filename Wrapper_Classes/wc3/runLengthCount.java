/* Implement run-length encoding
 using StringBuilder. For example,
 the string "aaabbcddd" should be
 converted to "a3b2c1d3".
Example:
Input: "aaabbcddd"
Output: "a3b2c1d3"*/
public class runLengthCount
{
	public static void main(String x[])
	{
		String str="aaabbcddd";
		StringBuilder encoding =new StringBuilder();
		int count=1;
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i) == str.charAt(i-1))
			{
				count++;
			}
			else
			{
				
				encoding.append(str.charAt(i - 1)).append(count);
				count=1;
			}
		}
		  encoding.append(str.charAt(str.length() - 1)).append(count);
		System.out.println(" "+encoding.toString());

	}
}
