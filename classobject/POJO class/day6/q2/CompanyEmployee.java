import java.util.*;
public class  CompanyEmployee
{
public static void main(String c[])
{
	Scanner sc=new Scanner(System.in);
	employee e1[]=new employee[2]; 
	company c1=new company();
	do
	{
	System.out.println("1: Add employee details");
	System.out.println("2: Display all employee Details:");
System.out.println("3: Search employee info wise:");
System.out.println("4: Delete employee using info wise ");
System.out.println("5: Update employee details using ingo wise");
System.out.println("6: Sorting employee details  ");
System.out.println("7: display employee details in higest sal");
System.out.println("8: display employee details in min salary 10000 to maximum salary 50000");
System.out.println("9: exit");
System.out.println("----enter your choice----");
	int choice=sc.nextInt();
	switch(choice)
	{
