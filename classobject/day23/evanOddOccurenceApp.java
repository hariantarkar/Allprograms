import java.util.*;
 class OccurenceApp 
{
	int arr[];
	int sum=0,temp=0,i;
	int count=0,ch=0;
void setValue(int ...b)
{
	arr=b;

}
void showevanOdd()
{
	
		    for(int i=0;i<arr.length;i++)
	            {
	            		if(arr[i]%2==0)
				{
					sum=sum+arr[i];
				}
				else
				{
				temp=temp+arr[i];
				}
		     }
				//System.out.println("Occurence evan no is "+sum);
				//System.out.println("Occurence odd no is "+temp);	
		

		     for(int i=0;i<arr.length;i++)
	            {
	            		if(arr[i]%2==0)
				{
					count++;				
				}
				else
				{
				ch++;				
				}
		     }
				System.out.println("total evan no is "+count);
				System.out.println("Occurence evan no is "+sum);
				System.out.println("total odd no is "+ch);
				System.out.println("Occurence odd no is "+temp);	
}
}

public class evanOddOccurenceApp 
{
	public static void main(String ...b)
	{
		 OccurenceApp OApp=new OccurenceApp();
		 OApp.setValue(10,20,11,11,11,11,11,11,100,11);
		OApp.showevanOdd();
	}
	
}
	
