import java.util.*;
public class perfectApp
{
public static void main(String[] args) 
{
	int num,i,j,temp=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no");
	num=sc.nextInt();
for(i=1;i<num;i++)
     {
	int sum=0;
		
    		for(j = 1;j<num;j++)
		 {
        	if(num%j==0)
	 	{
           	 sum=sum+j;
        	}
		}
     }

   	 if(sum == num) 
   	 {
        	System.out.println(sum);
    	}
 }
}

