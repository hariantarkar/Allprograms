class circumference
{
	private Circle circle;
	private double pi=3.14;
	double total;
public void setCircle(Circle circle)
{
	this.circle=circle;
}
	public void showinfocircle()
	{
	System.out.println(circle.getredius()+" ");
	}
	public void calculetcir()
	{
		total=2*(double)pi*circle.getredius();
		System.out.println("circumference of circle:"+total);
	}
}