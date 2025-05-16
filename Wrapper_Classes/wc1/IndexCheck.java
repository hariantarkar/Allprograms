//IndexOf method.
public class IndexCheck
{
	public static void main(String x[])
	{
		String str=("harishchandra antarkar hari harish harsh ");
		int  index=str.indexOf("antarkar");
		if(index!=-1)
		{
			System.out.println(" String found at index is:"+index);
		}
		else
		{
			System.out.println(" String not :"+index);	
		}
		
	}
}
