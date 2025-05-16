public class StringModifiy
{
	public static void main(String x[])
	{
		String s="Be";
		String s1="Positive";
		       s=s.concat(s1);
		System.out.println(s);
	
		System.out.println("Hash code of s is:"+System.identityHashCode(s));
		System.out.println("Hash code of s1 is:"+System.identityHashCode(s1));
		

	}
}
