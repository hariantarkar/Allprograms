class MaxNoVaiArg
{
	int max,i;
	int []arr;
void setValue(int ...x)
{
	arr=x;

}
int ShowMaxNo()
{
	for(i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
		max=arr[i];
		}
	}
	return max;
}
}
public class VaiArgMax
{
	public static void main(String ...x)
	{
		MaxNoVaiArg mn=new MaxNoVaiArg();
		mn.setValue(10,20,22,1,11,23,45,33,100,87);
		int result=mn.ShowMaxNo();
		System.out.println("max num is:"+result);
	}
}
	
	