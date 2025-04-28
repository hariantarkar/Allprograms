import java.util.*;
class  IntArrays
{
	 int sum = 0,num;

void setValue(int no)
{
	num=no;
}
int showAvg()
{
           while(num!=0)
	    {
            sum += num;
            }
		//temp=sum/numbers;
       //	System.ou.println("Avg is array "+temp);
	 return (double) sum / numbers.length;
}
}
public class ArrayAvg
{
    public static void main(String[] args)
	 {
       		 int[] numbers = {1, 2, 3, 4, 5};
		Scanner sc=new Scanner(System.in);
		numbers=sc.nextInt();
		IntArrays IA=new IntArrays();
		IA.setValue(numbers);
		IA.showAvg();
            double average = showAvg(numbers);
            System.out.println("The average is: " + average);
        }

}
