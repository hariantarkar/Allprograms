import java.util.*;
public class decedingArray
{
public static void main(String x[])
{
int a[]=new int[5];
int i,j,temp;
Scanner sc=new Scanner(System.in);
System.out.println("enter 5 elements");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.println("Givan array is :");
for(i=0;i<a.length;i++)
{
System.out.print(" "+a[i]);
}
for(i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("sorted array");
for(i=0;i<a.length;i++)
{
System.out.print(" "+a[i]);
}
}
}








