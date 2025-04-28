import java.util.*;
class Company
{
	private String Comname;
	private String 	Ceoname;
	private int empcount;

	public void setComName(String n)
	{
	Comname=n;
	}
		public String getComName()
		{
			return Comname;
		}
	public void setCeoName(String c)
	{
			Ceoname=c;
	}
	public String getCeoName()
	{
			return Ceoname;
	}
	public void setEmpCount(int empc)
	{
		empcount=empc;
	}
	public int getEmpCount()
	{
		return empcount;
	}
	}
class CompanyOpretion
{
	private Company em;
		void setemployee(Company empl)
		{
			em=empl;
		}
	void showCompanyD()
	{		
	System.out.println("company name"+em.getComName());
	System.out.println("company ceo name"+em.getCeoName());
	int result=em.getEmpCount();

	if(result>500)
	{
	System.out.println("company is large ");
	}
	else
	{
	System.out.println("company is small ");
	}
	}
}
public class CompanyApp
{
public static void main(String x[])
{
	Scanner sc=new Scanner(System.in);

	Company c1=new Company();
	System.out.println("enter company name");
	String name=sc.nextLine();
	c1.setComName("name");

	System.out.println("enter company ceo");
	String ceo=sc.nextLine();
	c1.setCeoName("ceo");

	System.out.println("enter total  company employee");
	int no=sc.nextInt();
	c1.setEmpCount(no);

	CompanyOpretion co=new CompanyOpretion();
	co.setemployee(c1);
	co.showCompanyD();

}
}








