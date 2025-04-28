import java.util.*;
public class CalCirCircle
{
public static void main(String x[])
{
	Scanner sc=new Scanner (System.in);
	System.out.println("enter a redius");
	int redius=sc.nextInt();
	Circle c1=new Circle();
	circumference cir1=new circumference();
	c1.setredius(redius);
	cir1.setCircle(c1);
	cir1.calculetcir();

}
}