import java.util.*;
import java.io.*;

class studentSearchData
{
	public static void main(String x[])throws Exception
	{	
		Scanner sc=new Scanner(System.in);	
		FileReader fr=new FileReader("C:\\Users\\Hari\\OneDrive\\Desktop\\Fold2\\FileHandling\\s.txt");
		BufferedReader br=new BufferedReader(fr);
		 System.out.println("enter a roll num");
		int rollNo=sc.nextInt();;
		String data;
		boolean found=false;
		while( (data =br.readLine()) != null)
		{
			if(data.contains(String.valueOf(rollNo)))
			{
				System.out.println("student data found");
				System.out.println(data);
				found=true;
				break;
			}

		}
		if(!found)
		{
			System.out.print("student  data not found");
		}
		br.close();
		fr.close();
	}
}
