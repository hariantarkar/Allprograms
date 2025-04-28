public class SumOfEvanNo
{
public static void main(String x[])
{
	int i=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no:");
	int no=sc.nextInt();
   
   while(i<=no)
   {
      if(i%2==0)
       {
			sum=aum+i;
			i++;
		}
			System.out.println(" "+sum);  
	}
}