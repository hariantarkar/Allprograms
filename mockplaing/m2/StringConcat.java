public class StringConcat
{
	public static void main(String x[])
	{
		String s="Be";
		String s1="Positive";
		String s2=s.concat(s1);
		System.out.println(s2);
		
		System.out.println("Hash code of s is:"+System.identityHashCode(s));
		System.out.println("Hash code of s1 is:"+System.identityHashCode(s1));
		System.out.println("Hash code of s2 is:"+System.identityHashCode(s2));

	}
}
