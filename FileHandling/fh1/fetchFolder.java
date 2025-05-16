//fetch only folder  file.
import java.io.*;
public class fetchFolder
{
	public static void main(String x[])
	{
		File path= new File("C:\\Users\\Hari\\OneDrive\\Desktop\\Fold2\\FileHandling");
		File  f[]=path.listFiles();
		for(int i=0;i<f.length;i++)
		{
			/*if(f[i].isFile())
			{
				System.out.println(f[i]);
			}*/
			if(f[i].isDirectory())
			{
				System.out.println(f[i]);
			}
			
	    }
	}
}
