//check  list present file.
import java.io.*;
public class FileList
{
	public static void main(String x[])
	{
		File path= new File("C:\\Users\\Hari\\OneDrive\\Desktop\\Fold2\\FileHandling\\fh1");
		File  f[]=path.listFiles();
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
	}
}
