public class missingNo
{
public static void main(String x[])
{
int a[]={1,3,6,9};
boolean b[]=new boolean[a.length+1];
for(int i=0;i< a.length;i++)
{
b[a[i]]=true;
}
for(int i=1;i<=b.length;i++)
{
if(!b[i])
{
System.out.println(i+" ");
}
}
}
}