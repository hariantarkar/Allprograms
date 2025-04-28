public  class  evanCubeSerloop
{
public static void main(String x[])
{
	int evanNum=2;
	int base=9;
	int index=3;
	int cube;
	for(int i=1;i<=9;i++)
	{
	System.out.print(evanNum+"  "); 
	evanNum +=2;
	cube=base*base*base;
	base--;
	System.out.print(cube+" ");
	}
}
}