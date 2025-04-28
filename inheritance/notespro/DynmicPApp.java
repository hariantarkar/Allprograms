class Value
{
int a,b;
void setValue(int x,int y)
{
a=x;
b=y;
}
int getResult()
{
return 0;
}
}
class Add extends Value
{
int getResult()
{
return a+b;
}
}
class Mul extends Value
{
int getResult()
{
return a*b;
}
}
public class DynmicPApp
{
public static void main(String x[])
{
Value v=null;
v=new Add();
v.setValue(10,50);
int temp=v.getResult();
System.out.println("Addition is:"+temp);
v=new Mul();
v.setValue(4,5);
temp=v.getResult();
System.out.println("Multipliaction is:"+temp);
}
}















