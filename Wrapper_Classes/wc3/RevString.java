public class RevString
{
	public static void main(String x[])
	{
		String str="hari";
		StringBuffer sb=new StringBuffer(str);
		System.out.println("Before rev string is:"+str);
		
		String s[]=str.split(" ");
		for(String a :s)
		{
			for(int i=(s.length()-1);i >= 0; i++)
			{
				sb.append(s.charAt(i));
			}
			sb.append=" ";
		}
		System.out.println("After rev string is:"+sb.toString());
	}
}
/*String s1;
		s1=str.concat(sb.toString);
		System.out.println("Mirror String is:"+s1);*/

			