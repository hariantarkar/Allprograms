//split method.
public class splitString
{
	public static void main(String x[])
	{
		String str=("harishantarkar3738@gmail.com,harshantarkar01@gmail.com,hariantarkar2003@gmail.com");
		String emails[]=str.split(",");
		
		for(String s:emails)
		{
			System.out.println(" "+s);
		}
	}
}
