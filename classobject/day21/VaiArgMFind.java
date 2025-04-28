class MaxVaiArg
{
	int max,i;
	int []arr;
void setValue(int ...x)
{
	arr=x;

}
void displayMax()
{
	for(i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
		max=arr[i];
		}
	}
	System.out.println("max no is:"+max);
}
}
public class VaiArgMFind
{
	public static void main(String ...x)
	{
		MaxVaiArg mn=new MaxVaiArg();
		mn.setValue(10,20,22,1,11,23,45,33,100,87);
		mn.displayMax();
	}
}
	
	