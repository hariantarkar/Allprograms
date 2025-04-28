class Area
{
	private Rectangle rect;
	int RArea=0;
public void setRectangle(Rectangle rect)
{
	this.rect=rect;
}
	public void showRectDetails()
	{
		System.out.println(rect.getlength()+" \t"+rect.getbreadth());
	}
	public void DisplayArea()
	{
	
		RArea=rect.getlength()*rect.getbreadth();
		System.out.println("Rectangle area:"+RArea);
	}
}