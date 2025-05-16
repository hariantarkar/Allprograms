//fetch all drive list from hard disk.
import java.io.*;
public class FileTest
{
	public static void main(String x[])
	{
		File f[]=File.listRoots();
		System.out.println("Total list of all drive:");
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
	}
}
