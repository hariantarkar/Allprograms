/*Create a mirror of a string around its center using StringBuilder.
Input: "race" → Output: "raceecar"*/
public class MirrorString
{
	public static void main(String x[])
	{
		String str="hari";
		StringBuilder sb = new StringBuilder(str);
		System.out.println("Before mirror string is:"+str);
		
		String words[]=str.split(" ");
		for(String word:words)
		{
			for(int i=(word.length()-1);i >= 0; i--)
			{
				sb.append(word.charAt(i));
			}
			sb.append(" ");
		}
		str=sb.toString();
		System.out.println("After mirror string is:"+str);	
	}
}

			