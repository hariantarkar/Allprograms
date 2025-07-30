import java.util.*;
public class majorityEle
{
	static int FindMajorityElement(int []nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			int count=0;
			int majority=nums[i];
			for(int j=0;j<nums.length;j++)
			{
				if(majority==nums[j])
				{
					count++;
				}
				if(count>nums.length/2)
				{
					return majority;
				}
			}
			
		}
		return -1;
	}
	public static void main(String x[])
	{
		int a[]={1,2,3,3,2,3,3,3,3,2,3,2,3,2};
		int result=FindMajorityElement(a);
		System.out.println(result);
	}
}
