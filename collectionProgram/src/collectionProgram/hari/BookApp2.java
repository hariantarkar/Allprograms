package collectionProgram.hari;

import java.util.Vector;

public class BookApp2
{

	public static void main(String[] args)
	{
		Vector v=new Vector();
		Book b=new Book();
		b.setId(1);
		b.setName("abc");
		b.setPrice(1000);
		Book b1=new Book();
		b1.setId(2);
		b1.setName("pqr");
		b1.setPrice(2000);
		Book b2=new Book();
		b2.setId(3);
		b2.setName("mno");
		b2.setPrice(3000);
		
		v.add(b);
		v.add(b1);
		v.add(b2);
		
		for(int i=0;i<v.size();i++)
		{
			Book book=(Book)v.get(i);
			System.out.println(book.getId()+"\t"+book.getName()+"\t"+book.getPrice());
			
		}

	}

}
