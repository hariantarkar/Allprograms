package collectionProgram.hari;
import java.util.*;
public class RemoveElement
{

	public static void main(String[] args)
	{
		ArrayList v=new ArrayList();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(300);
		v.add(500);
		Iterator i=v.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			if((int)obj==300)
			{
				i.remove();
			}
		}
		System.out.println(v);
		
	}

}
