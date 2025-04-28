import java.util.*;
public class RectAreaCal
{
public static void main(String x[])
{
	Scanner sc=new Scanner(System.in);
	Rectangle r1=new Rectangle();
	Area a1=new Area();
	System.out.println("enter rectangle length and breadth");
	int len=sc.nextInt();
	int breadth=sc.nextInt();
	r1.setlength(len);
	r1.setbreadth(breadth);
	a1.setRectangle(r1);
	a1.DisplayArea();
}
}

