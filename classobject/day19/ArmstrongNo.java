	import java.util.*;
class Armstrong
{
	int temp,rem,num,arm=0;
void setValue(int value)
{
   num=value;
}
void  checkArmstrong()
{

   /*for(int i=1;i<=num;i++)
   {
          temp =i;
            int count=0,sum=1,total=0;
           while(temp!=0)
 	   {
		temp/=10;
            count++;
	  }

         temp=i;
            while(temp!=0)
            {
             rem=temp%10;
            int j=1;
             sum=1;
                 while(j<=count)
                 {
                       sum*=rem;
                     j++;
                  }
               temp/=10;
                 total+=sum;
	    }
           
             if(i==total)
              System.out.print(i+"\t");

    }*/
	temp=num;
	while(num>0)
	{	
	rem=num%10;	
	arm=(rem*rem*rem)+arm;
	num=num/10;			
	}
	if(temp==arm)
	{
		System.out.println("no is Armstrong");	
	}
	else
	{
		System.out.println("no is not Armstrong");
	}
	
}

}
public class ArmstrongNo
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter num");
		int value=sc.nextInt();
		Armstrong arm=new Armstrong();
		arm.setValue(value);
		arm.checkArmstrong();
	}
}







