import java.util.*;
public class FrequencyOfEachDigit
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no :");
		int no=sc.nextInt();
		
		for(int i=0;i<=9;i++)
		{
			int temp=no,count=0;
			
			while(temp>0)
			{
				if(temp%10 == i)
				{
					count++;
				}
				temp=temp/10;
			}
			if(count >0)
			{
				System.out.println(i+"  frequency of digit is:   "+count);
			}
		}
	}
}
  










