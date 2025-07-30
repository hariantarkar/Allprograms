import java.util.Vector;

public class SortEle {
    public static void main(String x[])
    {
        Vector<Integer> v=new Vector<>();
        v.add(20);
        v.add(60);
        v.add(22);
        v.add(44);
        v.add(80);
        v.add(55);
        System.out.println("befour sorting"+v);
        SortElements(v);
    }
        
        public static void SortElements(Vector<Integer> v)
        {
            int n=v.size();

            for(int i=0;i<n-1;i++)
            {
                for(int j=0;j<n-i-1;j++)
                {
                    if(v.get(j)< v.get(j+1))
                    {
                        int temp=v.get(j);
                        v.set(j, v.get(j+1));
                        v.set(j+1,temp);
                    }
                }
                
            }
            System.out.println("After sorting"+v);
            
        }
}
