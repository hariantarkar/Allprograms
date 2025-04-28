import java.util.*;//package declear
public class mergeArray//class declear
{
	public static void main(String x[])//main
	{
	int a[]=new int[5];//array size
	Scanner sc=new Scanner(System.in);//object create
	System.out.println("enter 5 element first array");//user input
	for(int i=0;i<a.length;i++)//loop excution
	{
	a[i]=sc.nextInt();//input accept
	}
	System.out.println("enter  5 element in second array");//user input
	for(int j=0;j<a.length;j++)
	{
	a[j]=sc.nextInt();//input accept
	}	
	}//main close
}//class close