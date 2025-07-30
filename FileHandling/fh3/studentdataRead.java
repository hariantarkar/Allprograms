import java.util.*;
import java.io.*;

class studentdataRead
{
	public static void main(String x[])throws Exception
	{	
		FileReader fr=new FileReader("C:\\Users\\Hari\\OneDrive\\Desktop\\Fold2\\FileHandling\\s.txt");
		BufferedReader br=new BufferedReader(fr);
		int data;
		while( (data =fr.read()) != -1)
		{
			System.out.print((char)data);
		}
		System.out.print(data);
		br.close();
		fr.close();
	}
}
