import java.util.*;
public class MajorityElement1
{
	static int FindMajorityElement(int nums[])
	{
		int m=0;
		int vot=0;
		for(int i=0;i<nums.length;i++)
		{
			if(vot==0)
			{
				m=nums[i];
			}
			if(m==nums[i])
			{
				vot++;
			}
			else
			{
				vot--;
			}
		}
		return m;
	}
	
	public static void main(String x[])
	{
		int a[]={1,4,4,4,3,3,4,5,4,4,7,4,2,4};
		int result=FindMajorityElement(a);
		System.out.println(result);
	}
}
