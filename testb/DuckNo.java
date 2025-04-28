import java.util.*;
public class DuckNo
{
    public static void main(String x[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a no :");
      int no=sc.nextInt();
      //int duck;
  
      duck(no);
    }
      public static void duck(int num)
      {  int rem;
         boolean flag=false;
        while(num>0)
        {
        rem=num%10;
        num=num/10;
        if(rem==0)
	{
        flag=true; 
	}
        if(flag)
       {
        System.out.println("no is duck:");
       }
        else  
 	{
 	  System.out.println("no is not duck:");
	}
	
         duck(num--); 
	}
	
        }

}







    

