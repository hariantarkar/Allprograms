import java.util.*;
import java.io.*;

class studentdata
{
	public static void main(String x[])throws Exception
	{
		FileWriter f=new FileWriter("C:\\Users\\Hari\\OneDrive\\Desktop\\Fold2\\FileHandling\\s.txt",true);
		BufferedWriter f1=new BufferedWriter(f);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 student data roll num,name , marks");
		for(int i=0;i<2;i++)
		{
		int rollnum=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		int marks=sc.nextInt();
		f1.write("Roll No: " + rollnum + ", Name: " + name + ", Marks: " + marks);
		f1.newLine();
		}
		
		f1.close();
		f.close();
	}
}
