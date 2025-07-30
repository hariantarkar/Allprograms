import java.util.*;
class employee
{
    private int id;
    private String name;
    private int sal;
    employee(int id,String name,int sal)
    {
        this.id=id;
        this.name=name;
        this.sal=sal;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setSal(int sal)
    {
        this.sal=sal;
    }
    public int getSal()
    {
        return sal;
    }
}
public class emp {
    public static void main(String x[])
    {
        LinkedList<employee> li=new LinkedList<>();
        employee e=new employee(1,"ram",200);
        employee e1=new employee(2,"shyam",300);
        employee e2=new employee(1,"ganesh",500);
        li.add(e);
        li.add(e1);
        li.add(e2);
         System.out.println("Linkedlidt data");
         for(employee i : li)
         {
            System.out.println(i.getId()+"\t"+i.getName()+"\t"+i.getSal());
         }
         
    }
    
}

















