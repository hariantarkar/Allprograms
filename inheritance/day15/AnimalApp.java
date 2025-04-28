class Animal
{
	Animal()
	{
	}
	void MakeSound()
	{
	System.out.println("I am animal sound");
	}

}
class Cat extends Animal
{
	Cat()
	{
	}
	void makesound()
	{
	System.out.println("bark");
	}
}
public class AnimalApp
{
public static void main(String x[])
{
Cat c1=new Cat();
}
}