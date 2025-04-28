import java.util.*;
class BankAccount 
{
    protected String accountNumber;
    protected double balance;

BankAccount(String accountNumber, double balance)
{
   this.accountNumber = accountNumber;
   this.balance = balance;
}

void deposit(double amount)
{
    if (amount > 0)
    {
      balance = balance + amount;
       System.out.println("amount deposited : " + amount);
    } 
    else
     {
      System.out.println(" amount not deposite you enter zero.");
     }
}
void withdraw(double amount) 
{
   if (amount > 0 && amount <= balance) 
   {
       balance = balance- amount;
       System.out.println("amount withdrawn: " + amount);
    } 
    else
    {
     System.out.println(" amount not withdrawn.");
    }
}
void display() 
{
   System.out.println("Account Number is: " + accountNumber);
   System.out.println("Balance is : " + balance);
}
}
class SavingsAccount extends BankAccount 
{
final double INTEREST_RATE = 0.04;
SavingsAccount(String accountNumber, double balance) 
{
  super(accountNumber, balance);
}
void withdraw(double amount) 
{
   if (amount > 0 && amount <= balance * 0.5)
    {
       balance =balance-amount;
       System.out.println("amount is  withdrawn: " + amount);
     } 
   else
     {
       System.out.println("amount cannot withdraw more than 50% of balance.");
     }
}
}
class CurrentAccount extends BankAccount 
{
final double overdraft = 5000;
 CurrentAccount(String accountNumber, double balance) 
 {
  super(accountNumber, balance);
 }
void withdraw(double amount) 
{
 if (amount > 0 && (balance - amount)>=overdraft)
 {
    balance =balance-amount;
    System.out.println("amount withdrawn is: " + amount);
 } 
 else
  {
  System.out.println("overdraft cross.");
  }
}
}
public class BankTestApp 
{
public static void main(String x[])
{
Scanner  sc=new Scanner (System.in);
System.out.println("enter saving acount no and balance:");
String aco=sc.nextLine();
double bal=sc.nextDouble();
System.out.println("enter deposite amount saving account:");
double amount=sc.nextDouble();
System.out.println("enter withdrawn amount saving account:");
double withamount=sc.nextDouble();

 SavingsAccount s1 = new SavingsAccount(aco,bal);
System.out.println("----------> before processing Savings Account <-----------------");
s1.display();
System.out.println("---------->Afetr processing Savings Account <-----------------");
s1.deposit(amount);
s1.withdraw(withamount);
s1.display();

CurrentAccount c1 = new CurrentAccount("c@123", 10000);
System.out.println("--------------------------------------------------------------");
System.out.println("----------> before processing current account <-----------------");
c1.display();
System.out.println("-------> after processing current account <-----------");
c1.deposit(3000);
c1.withdraw(2000);
c1.display();
}
}
