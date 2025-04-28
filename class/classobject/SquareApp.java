import java.util.*;
class Square
{
	Scanner sc=new Scanner(System.in);
	int no;
    void setNo()
   {
	System.out.println("enter a no");
	no=sc.nextInt();
    }
    void ShowSquare()
    {
         System.out.printf("square is %d\n",no*no);
    }
}
public class SquareApp
{
	public static void main(String x[])
	{
		Square sq=new Square();
		sq.setNo();
		sq.ShowSquare();
	}
}