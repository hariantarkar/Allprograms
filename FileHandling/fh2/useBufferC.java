import java.io.*;
import java.util.*;
public class useBufferC
{
	public static void main(String x[])throws Exception 
	{
		FileWriter fw=new FileWriter("C:\\Users\\Hari\\OneDrive\\Desktop\\Fold2\\FileHandling\\fh2\\second.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a data in file:");
		String data=sc.nextLine();
		bw.write(data);
		bw.newLine();
		bw.close();
		fw.close();
		System.out.println("data saved successful........");
	}
}
	