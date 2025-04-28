abstract class Circle
{
protected float radius,PI;
	public Circle()
	{
	PI=3.14f;
	}
	void setRadius(float radius)
	{
		this.radius=radius;
	}
		abstract float getResult();
}
class Area extends Circle
{
		float getResult()
		{
			return PI*radius*radius;
		}
}
class Cirm extends Circle
{
		float getResult()
		{
			return PI*2*radius;
		}
}
public class AbstractApp
{
public static void main(String x[])
{
	Area a=new Area();
	a.setRadius(3.0f);

	float result =a.getResult();
	System.out.println("Arae of circle :"+result);
	Cirm cm=new Cirm();
	cm.setRadius(3.0f);

	result=cm.getResult();
	System.out.println("Cir of circle :"+result);
	}
}
















