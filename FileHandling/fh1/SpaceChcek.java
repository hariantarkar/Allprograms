//fetch all total space and free space harsdisk.
import java.io.*;
public class SpaceChcek
{
	public static void main(String x[])
	{
		File f[]=File.listRoots();
		System.out.println("Total space and free space in drive:");
		for(int i=0;i<f.length;i++)
		{
			long totalspace=f[i].getTotalSpace();
			long freespace=f[i].getFreeSpace();
			
			System.out.println(f[i]+"Total space is :"+(totalspace)/1073741824+" GB\t freespace is "+(freespace)/1073741824+"\tGB");
		}
	}
}
