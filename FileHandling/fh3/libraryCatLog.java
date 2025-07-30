import java.util.*;
import java.io.*;
class libraryCatLog
{
	public static void main(String x[])throws Exception
	{
		File file=new File("C:\\Users\\Hari\\OneDrive\\Desktop\\Fold2\\FileHandling\\s.txt");	
		Scanner sc=new Scanner(System.in);
		System.out.println("Book details:");
		System.out.println("enter book title ,author,price");
		String title=sc.nextLine();
		String author=sc.nextLine();
		int price=sc.nextInt();
		BufferedWriter b1=new BufferedWriter(new FileWriter(file,true));
		b1.write("Title"+ title + "Author" +author +"Price" + price);
		b1.newLine();
		b1.close();
		
		BufferedReader br=new BufferedReader(new FileReader(file));
	
	
		int count=0;
		while(br.readLine() != null)
		{
			count++;
		}
		System.out.println("Total Books is "+count);
		br.close();
	}
}

		