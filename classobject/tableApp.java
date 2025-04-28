import java.util.*;
class Table
{
	Scanner sc=new Scanner(System.in);
	int no,a;
void setValue()
{
	System.out.printf("enter a no:");
	no=sc.nextInt();
}
void showTable()
{
	for(int i=1;i<=10;i++)
	{
	a=i*no;
	System.out.println(" "+a);
	}
}
}
public class tableApp
{	
	public static void main(String x[])
	{
		Table t1=new Table();
		t1.setValue();
		t1.showTable();
	}
}