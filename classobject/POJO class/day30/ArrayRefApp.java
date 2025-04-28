//Example to modify the array by reference  
class TestArray
{
	int[]a;
public void acceptArray(int arr[])
{
	a=arr;
}
int [] getArray()
{
	for(int i=0;i<a.length;i++)
	{
	a[i]=a[i]+10;
	}
	return a;
}
}
public class ArrayRefApp
{
	public static void main(String c[])
	{
	int a[]=new int[]{10,20,30,40,50};
	TestArray TA=new TestArray();
	TA.acceptArray(a);
	int result[]=TA.getArray();
	System.out.println("Array Value is:");
	for(int i=0;i<result.length;i++)
	{
	System.out.printf("%d\t",result[i]);
	}
	}
}
















