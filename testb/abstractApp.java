import java.util.*;//package define
abstract class product //class declear
{

	abstract void discount();//method
	abstract void FinalPrice();//method
}
class Elentronic
{
	private int temp;//variable initilize
	private int eleprice;
	void setprice(int eleprice)
	{
		this.eleprice=eleprice;
	}
	void discount()
	{
		System.out.println("without discount price elentronic :"+eleprice);
		temp=eleprice=eleprice*10/100;
		//System.out.println("with discount price elentronic :"+temp);
	}
	void FinalPrice()
	{
		System.out.println("with discount price elentronic :"+temp);
	}
}
class Clothing
{
	private int temp1;
	private int cloprice;
	void setprice(int cloprice)
	{
		this.cloprice=cloprice;
	}
	void discount()
	{
		System.out.println("without discount price clothing  :"+cloprice);
		temp1=cloprice=cloprice*20/100;
		//System.out.println("with discount price clothing :"+temp1);
	}
		void FinalPrice()
	{
		System.out.println("with discount price elentronic :"+temp1);
	}	

}

public class abstractApp
{
	public static void main(String x[])//main
	{
		Scanner sc=new Scanner(System.in);//create ref 
		System.out.println("enter a eleprice and cloprice:");//output statement
		int ep=sc.nextInt();//accept input 
		int cp=sc.nextInt();
		
		Elentronic e1=new Elentronic();//create object Elentronic class  
		e1.setprice(ep);
		e1.discount();
		e1.FinalPrice();
		System.out.println("------------------");
		Clothing c1=new Clothing();//create object clothing  class  
	
		c1.setprice(cp);
		c1.discount();//function call
		c1.FinalPrice();
	}
}



 





