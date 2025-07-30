import java.io.*;
import java.util.*;
class EmpPayRoll
{
	public static void main(String x[])throws Exception
	{	
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Employee PayRoll System");
		System.out.println("1: Add employee:");
		System.out.println("2: read employee data");
		System.out.println("enter choice");
		int choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
			FileWriter f=new FileWriter("C:\\Users\\Hari\\OneDrive\\Desktop\\Fold2\\FileHandling\\s.txt",true);
			BufferedWriter f1=new BufferedWriter(f);

			System.out.println("enter  emp data id ,name , salary");
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			int salary=sc.nextInt();
			f1.write("Roll No: " + id + " Name: " + name + " salary: " + salary);
			f1.newLine();
			f1.close();
			f.close();
			break;
			case 2:
			FileReader fr=new FileReader("C:\\Users\\Hari\\OneDrive\\Desktop\\Fold2\\FileHandling\\s.txt");
			BufferedReader br=new BufferedReader(fr);
			int data;
			while( (data =fr.read()) != -1)
			{
				System.out.print((char)data);
			}
				System.out.print(data);
				br.close();
				fr.close();
			break;
			default :
			System.out.println("wrong choice");
		}
		
		
		
	}
}
