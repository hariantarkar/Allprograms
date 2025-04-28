class bookInfo
{
	private book books[];
public void setbook(book books[])
{
	this.books=books;
}
public void showbook()
{
for(int i=0;i<books.length;i++)
{
System.out.println(books[i].getaccenssion()+" \t"+books[i].getTital()+" \t"+books[i].getAuthor()+" \t"+books[i].getName()+" \t"+books[i].getprice());
}
}
public void showBookAuthor()
{
for(int i=0;i<books.length;i++)
{
System.out.println(books[i].getName()+" \t"+books[i].getAuthor());
}
}
public void showBookTital()
{
for(int i=0;i<books.length;i++)
{
System.out.println(books[i].getName()+" \t"+books[i].getTital());
}
}
public void showTotalBook ()
{
int count=0;
for(int i=0;i<books.length;i++)
{
	count++;
}
System.out.println("Total library books:"+count);
}
public void showListAccenssion()
{
for(int i=0;i<books.length;i++)
{
System.out.println(books[i].getName()+" \t"+books[i].getaccenssion());
}
}
public void showcalprice()
{
int total=0;
System.out.println("  Total price of all book:");
for(int i=0;i<books.length;i++)
{
total += books[i].getprice();
}
System.out.println("Total price of all books:"+total);

}
}