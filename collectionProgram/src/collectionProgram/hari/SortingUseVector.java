package collectionProgram.hari;
import java.util.*;
public class SortingUseVector 
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
		System.out.println("Data before sorting");
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.print(" "+obj);
		}
		for(int k=0;k<v.size();k++)
		{
			for(int j=(k+1);j<v.size();j++)
			{
				Object prev=v.get(k);
				Object next=v.get(j);
				if((int)prev > (int) next)
				{
					v.set(k, next);
					v.set(j, prev);
					
				}

			}
			
		}
					System.out.println("\nData after sorting");
					i=v.iterator();
					while(i.hasNext())
					{
						Object obj=i.next();
						System.out.print("  "+obj);
					}
	}

}
