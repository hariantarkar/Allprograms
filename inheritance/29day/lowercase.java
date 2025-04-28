class convertUpercase
{
private char arr[];
	convertUpercase(char arr[])
	{
		this.arr=arr;
	}
		public void show()
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i] >= 'a' &&  arr[i] <= 'z' )
				{
					char ch=((char)arr[i]-32);
					System.out.println("upper case is :"+ch);
				}
			}
		}
}
public class lowercase
{
	public static void main(String x[])
	{
		char c[]={'c','a'};
		char cha='c';
		
		convertUpercase c1=new convertUpercase(cha);
		c1.show();
	}
}


















