package collectionProgram.hari;
import java.util.*;
import java.util.Vector;

public class VectorString 
{

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add("Hari");
		v.add("Shahadeo");
		v.add("Antarkar");
		Iterator it=v.iterator();
		String str="";
		while(it.hasNext())
		{
			Object obj=it.next();
			str=str+" "+(String)obj;
			
		}	System.out.print(" "+str);

	}

}
