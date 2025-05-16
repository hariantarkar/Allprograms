//Create a program to display the maximum and minimum values of Integer, Double, and Byte using their wrapper class constants>
public class FindMaxMin
{
	public static void main(String x[])
	{
		System.out.print("Integer ");
		System.out.print(Integer.MIN_VALUE);
		System.out.println("  "+Integer.MAX_VALUE);
		System.out.print("Double  ");
		System.out.print(Double.MIN_VALUE);
		System.out.println("  "+Double.MAX_VALUE);
		System.out.print("Byte  ");
		System.out.print(Byte.MIN_VALUE);
		System.out.println("  "+Byte.MAX_VALUE);
	}
}
