import java.util.*;
public class stackApp
{
	static int a[]=new int[5];
	static int top=-1;
	static int choice;
 	public static void main(String x[])
	{
	Scanner sc=new Scanner(System.in);
	   do
	   {
		System.out.println("1:push");
		System.out.println("2:pop");
		System.out.println("3:display");
		System.out.println("4:exit");
		System.out.println("enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
		
		case 1:
			System.out.println("enter push value in stack");
			int value=sc.nextInt();
			push(value);
			break;
		case 2:
			int result=pop();
			System.out.println("remove value from stack"+result);
			break;
		case 3:
		        display();
			break;
		case 4:	
			System.exit(0);
			break;
		default:
			System.out.println("you enter wrong choice");
		}
	   }while(true);
	}
		public static void push(int value)
		{
			if(top==(a.length-1))
			{
			System.out.println("satck is overflow");
			}
			else
			{
			top=top+1;
			a[top]=value;
			System.out.println("element inserted sucessful");
			}	
		}
		public static int pop()
		{
			if(top==-1)
			{
			System.out.println("stack is underflow");
			return-1;
			}
			else
			{
			int value=a[top];
			top=top-1;
			return value;
			}
		}
		public static void display()
		{
			if(top==-1)
			{
			System.out.println("stack is underflow");
		
			}
			else
		        {
				for(int i=top;i>=0;i--)
				{
				System.out.println(" "+a[i]);
				}
			}
		}
}  

			











