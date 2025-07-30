import java.util.HashMap;
public class LongestSubstr
 {
    public static void main(String x[])
	{
        String str = "eceba";
        int k = 2;
        if (str == null || k == 0)
		{
            System.out.println(0);
		   
		}
        int Length = 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i=0; i<str.length();i++)
		{
            char Char = str.charAt(i);
            map.put(Char, map.getOrDefault(Char, 0) + 1);
            while (map.size() > k)
			{
                char Char1 = str.charAt(j);
                map.put(Char1, map.get(Char1) - 1);
                if (map.get(Char1) == 0)
				{
                    map.remove(Char1);
                }
                j++;
            }
            Length = Math.max(Length, i - j + 1);
        }
        System.out.println("Output: " + Length);
    }
}
