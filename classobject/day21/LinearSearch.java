import java.util.*;
class LSearch
{
	int []arr;
	int i,index;
void setValue(int ...x)
{
   arr=x;
}
int GetResult(int value)
{
	int index=-1;
	for(i=0;i<arr.length;i++)
	{
	if(arr[i]==value)
	{
	index=i;
	break;
	}
	}
	//System.out.println("search element is:"+index);
	return index;
}
}
public class LinearSearch
{
	public static void main(String ...x)
	{	
		int result;
		LSearch ls=new LSearch();
		ls.setValue(10,54,33,23,11,398,54);
		 result=ls.GetResult(100);
		if(result!=0)
		{
		System.out.println("no is present:");
		}
		else
		{
		System.out.println("no is not present:");
		}
	}
}
	