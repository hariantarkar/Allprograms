import java.util.*;
class Table2
{
	int i,temp,t;
void setTable(int no)
{
temp=no;
}
void showTable()
{
 	for(i=1;i<=10;i++)
	{
	t=i*temp;
	System.out.println("table is"+t);
	}
}
}
public class TablePrint2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		Table t=new Table();
		t.setTable(no);
		t.showTable();
	}
}