
import java.util.*;
class LarSmallNum
{
LarSmallNum(int nums[])
{
int lar=nums[0];
int  small=nums[0];
		     for(int i=1;i<nums.length;i++)
	           {
	            if(nums[i] >lar)
				{
					lar=nums[i];
				}
				if(nums[i] < small)
				{
					small=nums[i];
				}
			}
		System.out.println("largergest value is "+lar);
		System.out.println("smallest value is "+small);
}
}
public class largerAndSmallestEle
{
	public static void main(String c[])
	{
	int a[]=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter element:");
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		LarSmallNum ls=new LarSmallNum(a);
}
}

















