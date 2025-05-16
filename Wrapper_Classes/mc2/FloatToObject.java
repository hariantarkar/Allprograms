//Take a float number and convert it into a Float object. Print its int value using intValue() method.
public class FloatToObject
{
	public static void main(String x[])
	{
		float f=2.2f;
		Float F=Float.valueOf(f);
		System.out.println(F.intValue());
	}
}
