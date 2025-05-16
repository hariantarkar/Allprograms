//craete folder in using file .
import java.io.*;
public class CreateFile
{
	public static void main(String x[])
	{
		File f=new File("C:\\TestNewFile");
		boolean b=f.mkdir();
		if(b)
		{
			System.out.println("folder craeted:");
		}
		else
		{
			System.out.println("folder not  craeted:");
		}
	}
}

