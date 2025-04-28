import java.util.*;
public class BankApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter bank account no and balance");
		int Ano=sc.nextInt();
		int balance=sc.nextInt();

		Bank b1=new Bank();
		userDetails ud=new userDetails();

		b1.setAcountNo(Ano);
		b1.setBalance(balance);

		ud.setBank(b1);
		System.out.println("acount no   balance");
		System.out.println("________________________");
		ud.show();
	}
}