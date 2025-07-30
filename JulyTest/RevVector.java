import java.util.Vector;

public class RevVector {
    public static void main(String x[])
    {

        Vector v=new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);


        System.out.println("Befour reverse"+v);
        RevElements(v);
      

    }

    public static void RevElements(Vector<Integer> v)
    {
        int left = 0;
        int right = v.size() - 1;

        while (left < right)
        {
            int temp = v.get(left);
            v.set(left, v.get(right));
            v.set(right, temp);
            left++;
            right--;
        }
        System.out.println("Ater Reverse" + v);
    }
}
