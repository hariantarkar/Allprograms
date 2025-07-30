package collectionProgram.hari;
import java.util.*;

public class BookAppUEnu 
{

	public static void main(String[] args)
	{
		Vector v=new Vector();
		Book b=new Book();
		b.setId(1);
		b.setName("abcd");
		b.setPrice(500);
		Book b1=new Book();
		b1.setId(2);
		b1.setName("pqr");
		b1.setPrice(600);
		Book b2=new Book();
		b2.setId(3);
		b2.setName("mno");
		b2.setPrice(070);
		
		v.add(b);
		v.add(b1);
		v.add(b2);
		
		Enumeration i=v.elements();
		while(i.hasMoreElements())
		{
			Object obj=i.nextElement();
			Book book=(Book)obj;
			System.out.println(book.getId()+"\t"+book.getName()+"\t"+book.getPrice());
			
		}

	}

}
