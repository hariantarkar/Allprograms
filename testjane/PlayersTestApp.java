import java.util.*;
class Player
{
    private int jersyno;
    private String name;
    private int run;
    private int matches;
	Player(int jersyno, String name, int run, int matches) 
	{
        this.jersyno = jersyno;
        this.name = name;
        this.run = run;
        this.matches = matches;
	}
	void display()
	{
		System.out.println("Jersey No: " + jersyno + " Name: "
		+ name + " Runs: " + run + " Matches: " + matches);
	}
}
public class PlayersTestApp
{
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);
	Player p1[]=new Player[3];
	for (int i = 0; i <p1.length; i++)
	{
            System.out.println("Enter player jersyno and name and run and matches");
            int jersyno = sc.nextInt();
            String name = sc.nextLine();
			sc.nextLine();
            int run = sc.nextInt();
            int matches = sc.nextInt();
		
			p1[i] = new Player(jersyno, name, run, matches);

    }
			System.out.println("---------->: All Player Information: <--------------------");
			for (int i = 0; i <p1.length; i++) 
			{
				p1[i].display();
			}
	/*System.out.println("enter index:");
	int index=sc.nextInt();
        int count = 0;
        for (int i = 0; i < p1.length - count; i++)
	 {
            if (p1[i] == index) 
		{
                count++;
                for (int k = i; k < p1.length - 1; k++)
		 {
                    p1[k] = p1[k + 1];                  }
                p1[p1.length - 1] = null; 
                i--; 
                }
          }

        System.out.println("---------->: Remaining Player Information: <--------------------");
        for (int i = 0; i < p1.length - count; i++)
	 {
            if (p1[i]= null)
	    {
                p1[i].display();
            }
        }*/
      
    }
}
