public class courierApp
{
public static void main(String x[])
{
courier c1=new courier();
parcel p1=new parcel();
p1.setid(1);
p1.setName("abc");
p1.setdestAdd("xyz");
c1.setParcel(p1);
//int temp=c1.getParcel();
c1.setcompName("pqr");
String temp1=c1.getcompName();
c1.getParcel();
System.out.println("parcel "+);
System.out.println("compName:"+temp1);
}
}