import java.util.*;
abstract class WalletPayment 
{
    protected String wid;
    protected double balance;

WalletPayment(String wid, double balance) 
{
        this.wid = wid;
        this.balance = balance;
}
abstract void makePayment(double amount);
void display() 
{
   System.out.println("Wallet id is: " + wid);
   System.out.println("available Balance is : " + balance);
}
}
class PaytmWallet extends WalletPayment
{
  final double TFee= 0.015; 

PaytmWallet(String wid, double balance) 
{
 super(wid, balance);
}
void makePayment(double amount)
{
 double fee = amount * TFee;
 double deduction = amount + fee;
     if (balance >= deduction) 
      {
         balance =balance-deduction;
	 System.out.println("Tranjection fees:"+fee);
         System.out.println("successfully payment in paywallet :" + amount );
      } 
	else
	 {
            System.out.println("balance not available.");
         }
}
}

class GooglePayWallet extends WalletPayment
{
    final double TFee = 0.012; 

GooglePayWallet(String wid, double balance)
    {
        super(wid, balance);
    }
void makePayment(double amount)
{
   double fee = amount * TFee;
   double deduction = amount + fee;
        if (balance >= deduction)
	{
        balance =balance-deduction;
        System.out.println("Tranjection fees:"+fee);
        System.out.println("Google pay wallet payment successfull." + amount );
        }
	else
	{
        System.out.println("balance not available.");
        }
}
}
public class MobileWallApp
{
public static void main(String x[]) 
{
Scanner sc=new Scanner(System.in);
System.out.println("enter wallet id and balance :");
String id=sc.nextLine();
double bal=sc.nextDouble();
System.out.println("enter a amount to pay:");
double amount=sc.nextDouble();


   PaytmWallet p1 = new PaytmWallet(id,bal);
System.out.println("---------paytem pay wallet details---------------");
   p1.display();
   p1.makePayment(amount);
   System.out.println("------------->: After processing  :<----------");
   p1.display();
System.out.println("-------------------------------------------");
   GooglePayWallet g1 = new GooglePayWallet("Gpay@123",3000);
System.out.println("---------Google pay wallet details---------------");
    g1.display();
    g1.makePayment(100);
 System.out.println("------------->: After processing  :<----------");
    g1.display();
}
}
