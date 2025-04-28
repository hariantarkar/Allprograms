import java.util.*;
class count
{
	Scanner sc=new Scanner(System.in);
	int count=0,no;
void setValue()
{
	System.out.println("enter a no");
	no=sc.nextInt();
}
void showCount()
{
	 while (no!= 0)
	 {
           no = no/10;
           ++count;
    	  }
	System.out.println("Total digit count No is:"+count);
}
}
public class DigitCount1
{
	public static void main(String x[])
	{
		count cd=new count();
		cd.setValue();
		cd.showCount();
	}
}








