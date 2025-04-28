import java.util.*;
public class ProCust
{
public static void main(String x[])
{
Scanner sc=new Scanner (System.in);
product p1=new product();
product ps[]=new product[2];
Customer c1=new Customer();
Shop s1=new Shop();

System.out.println("enter prod info:");
for(int i=0;i<ps.length;i++)
{
ps[i]=new product();
int pid=sc.nextInt();
sc.nextLine();
String name=sc.nextLine();
int qt=sc.nextInt();
int price=sc.nextInt();
ps[i].setId(pid);
ps[i].setName(name);
ps[i].setqty(qt);
ps[i].setprice(price);
sc.nextLine();
}
c1.setCid(1);
c1.setCName("ram");
c1.setAddress("pune");


s1.setproduts(ps);
s1.setCustomer(c1);
s1.showbill();
}
}







	