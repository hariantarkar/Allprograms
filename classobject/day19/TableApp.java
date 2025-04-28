class Table
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
public class TableApp
{
	public static void main(String x[])
	{
		Table t=new Table();
		t.setTable(5);
		t.showTable();
	}
}