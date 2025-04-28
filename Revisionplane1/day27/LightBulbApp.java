import java.util.*;
class LightBulb
{
	private boolean state;
	LightBulb()	
	{
		Boolean bulb=false;
	}
		LightBulb(Boolean state)
		{
			this.state=state;
		}
			void turnOn()
		{
		if(state==1)
		{
			bulb=true;
			System.out.println("current state is :"+bulb);
		}
}
		void turnoff()
		{
			if(state==0)
			{
				bulb=false;
				System.out.println("current state is :"+bulb);
			}
}
}
public class LightBulbApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		LightBulb lb=new LightBulb(1);
		lb.turnOn();
		lb.turnoff();
	}
}























