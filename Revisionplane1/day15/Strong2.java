//all strong no 1 to 500
public class Strong2
{
	public static void main(String x[])
	{
		for (int num=1;num<=500;num++)
		{
			int rem,fact=1,i,sum=0;
			int temp;
			temp=num;
			
			while(num>0)
			{
				rem=num%10;

				for(i=1;i<=num;i++)
				{
					fact=fact*i;
				}
				num=num/10;
				sum=sum+fact;
			}
			if(num==sum)
			{
				System.out.println(temp);
			}
			num=temp;
		}
	}
}

