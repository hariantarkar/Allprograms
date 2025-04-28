import java.util.*;
public class RevApp
{
public static void main(String x[])
{
int i,j,temp;
int a[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("enter number:");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
System.out.println("given array:");
for(i=0;i<a.length;i++)
{
System.out.print(" "+a[i]);
}
for(i=0,j=a.length-1;i<j;i++,j--)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
System.out.println("Rev array is :");
for(i=0;i<a.length;i++)
{
System.out.print(" "+a[i]);
}

}
}

