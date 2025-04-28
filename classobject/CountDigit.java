import java.util.*;
class countDigit
{
	Scanner sc=new Scanner(System.in);
	int count=0,no;
void setValue()
{
	System.out.println("enter a no");
	no=sc.nextInt();
}
void showDigitCount()
{
	 while (no!= 0)
	 {
           no = no/10;
           ++count;
    	  
	System.out.println("No digit count:"+count);
	}
}
}
public class CountDigit
{
	public static void main(String x[])
	{
		countDigit cd=new countDigit();
		cd.setValue();
		cd.showDigitCount();
	}
}








