import java.util.*;//package define
public class patNo //class declar
{
	public static void main(String x[])//progarm entery
	{
	int i,j,no;//varible initilization.
	Scanner sc=new Scanner(System.in);//object create
	System.out.println("enter a no");//user input
	 no=sc.nextInt();//input accept
		for(i=1;i<=5;i++)//row line loop
		{
			for( j=1;j<=5;j++)//colomn line loop
			{
			if(i==2&&j==3||i==3&&j==2||i==3&&j==4||i==4&&j==3)//condition
			{
			System.out.printf(" 0 ");//output statement
			}
			else
			{
			System.out.printf(" 1 ");//output statement
			}
			}
		System.out.println(" ");//new line
		}
	}//main close
}//class close