import java.io.*;
public class FileConst
{
	public static void main(String x[])throws Exception
	{
		FileInputStream fin =new FileInputStream("C:\\Users\\Hari\\OneDrive\\Desktop\\Fold2\\FileHandling\\fh2\\first.txt");
		int data;
		while((data=fin.read())!=-1)
		{
			 char ch=(char)data;
			 System.out.print(ch);
		}
	}
}
