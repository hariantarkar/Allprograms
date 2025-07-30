import java.io.*;
public class RetriveDriveList
{
	public static void main(String x[])
	{
		File f[]=File.listRoots();
		System.out.println ("Drive list of lips");
		for(int i=0;i<f.length;i++)
		{
			System.out.println(" "+f[i]);
		}
	}
}

	