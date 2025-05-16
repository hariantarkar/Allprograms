//check folder present or not if not present then new create using file .
import java.io.*;
public class FolderCheck
{
	public static void main(String x[])
	{
		File f=new File("C:\\UseFileclass");
		boolean b=f.exists();
		if(b)
		{
			System.out.println("folder is already craeted:");
		}
		else
		{
			String output=f.mkdir() ? "folder created " : "folder not craeted";
			System.out.println(""+output);
		}
	}
}

