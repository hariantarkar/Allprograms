	
/*Q2. Write a java program to create class name as OccurenceApp using contsructor name as :

	OccurenceApp(int [ ])
	{
		//  count even and odd number in array.
	}
	
	OccurenceApp(char [ ])
	{
		//  count vowel and consonent charcter in string.
	}*/
class OccurenceApp
{
OccurenceApp(int nums[])
{
int evancount=0,oddcount=0;
	for(int num : nums)
	{
	if(num % 2 == 0)
	{
	evancount++;
	}
	else
	{
	oddcount++;
	}
	}
	System.out.println("Even numbers count: " +evancount);
	System.out.println("odd num count :"+oddcount);
}
}
public class evanOccurenceApp
{
public static void main(String x[])
{
int a[]={1,4,4,2,6,5,4,5,3};
OccurenceApp o1=new OccurenceApp(a);
}
}









