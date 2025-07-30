import java.util.*;
public class RemoveEle
{
	static int RemoveElement(int[] nums,int element)
	{	int k=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=element)
			{
				nums[k]=nums[i];
				k++;
			}
		}
		return k;
	}
	
	public static void main(String x[])
	{
		int []a={1,2,4,3,4,2,4,5,7,6,4};
		int val=4;
		int result=RemoveElement(a,val);
		System.out.println(" "+result);
	}
}
