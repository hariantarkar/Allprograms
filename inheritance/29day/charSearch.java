class SearchNo
{
	private char arr[];

	public SearchNo(char []arr)
	{
		this.arr=arr;
	}
	public void SearchChar(char ch)
	{
		Boolean b=false;
		for(char c : arr)
		{
			if(c==ch)
			{
				b=true;
				break;
			}
		}
			if(b)
			System.out.println("char is found:");
			else 
			System.out.println("char are not found:");
	}
}
public class charSearch
{
	public static void main(String x[])
	{
		char arr[]={'a','s','q','e','t','u','p'};
		char ch='a';

		SearchNo s1=new SearchNo(arr);
		s1.SearchChar(ch);
	}
}















