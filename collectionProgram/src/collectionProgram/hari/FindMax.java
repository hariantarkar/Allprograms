package collectionProgram.hari;

import java.util.Iterator;
import java.util.Vector;

public class FindMax
{

	public static void main(String[] args)
	{
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(100);
		v.add(40);
		v.add(200);
		v.add(30);
		Iterator i=v.iterator();
		System.out.println("Vector Data");
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.print(" "+obj);
		}
		Object max=v.get(0);
		
		for(int k=0;k<v.size();k++)
		{
			if((int) v.get(k) > (int)max)
			{
				max=(int)v.get(k);
				
			}
		}		
		System.out.println("\nmax value from vector"+max);	


	}

}
