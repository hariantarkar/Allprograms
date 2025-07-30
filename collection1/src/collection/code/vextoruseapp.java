package collection.code;
import java.util.*;
public class vextoruseapp
{

	public static void main(String[] args)
	{
		Vector v =new Vector();
		do 
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("1: Add element");
			System.out.println("2: Vuew All elements");
			System.out.println("3 : count number of element");
			System.out.println("4: search element bu contain element");
			System.out.println("5: Search elements by index");
			System.out.println("6: delete by using its index");
			System.out.println("7: fecth elements by using get method");
			System.out.println("8: sublist");
			System.out.println("remove elememt by value");
			System.out.println("enter a choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter data in vector");
				int element=sc.nextInt();
				boolean b=v.add(element);
				if(b)
				{
					System.out.println("elements added");
					
				}
				else
				{
					System.out.println("element not added");
					
				}
			break;
			case 2: 
				Iterator i=v.iterator();
				while(i.hasNext())
				{
					Object obj=i.next();
					System.out.println(obj);
					
				}
			break;
			case 3 :
				System.out.println("Number of element in vector"+v.size());
			break;
			case 4:
				System.out.println("enter value to be search using contains method");
				element=sc.nextInt();
				b=v.contains(element);
				if(b) 
				{
			      System.out.println("element found ");
			      
				}
				else
				{
					System.out.println("element not found");
					
				}
			break;
			case 5:
				System.out.println("enter a elements to search using indexof method");
				element=sc.nextInt();
				int index=v.indexOf(element);
				if(index !=-1)
				{
					System.out.println("element found");
					
				}
				else
				{
					System.out.println("element not found");
					
				}
			break;
			case 6:
				System.out.println("enter element for delete by using index ");
				element=sc.nextInt();
				index=v.indexOf(element);
				if(index!=-1)
				{
					Object obj=v.remove(index);
					System.out.println("element deleted");
				}
				else
				{
					System.out.println("enter a curect element");
				}
			break;
			case 7:
				for(int j=0;j<v.size();j++)
				{
					Object obj=v.get(j);
					System.out.println(obj);
				}
			break;
			case 8:
				System.out.println("enter start and end index");
				int startInex=sc.nextInt();
				int endIndex=sc.nextInt();
				if(startInex >=0 && endIndex <v.size());
				{
					List list=v.subList(startInex, endIndex);
					for(Object obj:list)
					{
						System.out.println(obj+"");
					}
				}
			break;
			case 9:
				System.out.println("enter delete element  by using value ");
				int value=sc.nextInt();
				v.remove((Object)value);
				
			break;
			case 10:
				System.exit(0);
			break;
			default:
			System.out.println("your choice wrong");
			break;
			}
			}while(true);
	}
	

}


