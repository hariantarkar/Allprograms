import java.io.*;
import java.util.*;
public class CopyImg
{
	public static void main(String x[])throws Exception
	{
	    FileInputStream fi =new FileInputStream("C:\\Users\\Hari\\OneDrive\\Desktop\\exam\\img2.jpeg");
		int data;
		FileOutputStream fo =new FileOutputStream("C:\\Users\\Hari\\OneDrive\\Desktop\\Fold2\\FileHandling\\fh2\\img2.jpeg");
		 
		while((data=fi.read())!=-1)
		{
			fo.write(data);
		}
		fo.close();
		fi.close();
		System.out.println("save");
	}
}
