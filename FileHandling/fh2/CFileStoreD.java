import java.io.*;
import java.util.*;
public class CFileStoreD
{
	public static void main(String x[])throws Exception
	{
		FileWriter fw=new FileWriter("C:\\Users\\Hari\\OneDrive\\Desktop\\Fold2\\FileHandling\\fh2\\first.txt",true);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter data in file");
		String data=sc.nextLine();
		fw.write(data);
		fw.close();
		System.out.println(" data save..........");
	}
}

	