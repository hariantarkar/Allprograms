import java.util.*;
public class AllNumOccu
{
	public static void main(String x[])
	{
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 10 no:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
			System.out.println("Occurance of evary each elemet:");
     
			for(int i=0;i<a.length;i++)
			{
				int count=1;
				boolean b=false;

				for(int j=1;j<i;j++)
				{
					if(a[i]==a[j])
					{
						b=true;
						break;
					}
				}
				if(!b)
				{
					for(int k=i+1;k<10;k++)
					{
						if(a[i]==a[k])
						{
							count++;
						}
					}
				}
				System.out.println(a[i]+"present in "+count+"times");
			}
		}
	}	
}













