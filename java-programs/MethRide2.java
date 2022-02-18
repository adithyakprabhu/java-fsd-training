//Method Overriding 2
package Training_java;

public class MethRide2 
{
	public static void main(String[] args)
	{
		//First Parent Overriding
		University u = new Uoc();
		u.display();
		u.location();
		//Second Parent Overriding
		Degree d = new Btech();
		d.duration();
		d.elig();
	}
}
class University
{	void display()
	{
		System.out.println("University invoked");
	}
	void location()
	{
		System.out.println("Throughout Kerala");
	}
}
class Uoc extends University
{
	void display()
	{
		System.out.println("University of Calicut invoked");
	}
	void location()
	{
		System.out.println("In Malappuram");
	}
}
class Degree 
{
	void duration()
	{
		System.out.println("Upto 4 years");
	}
	void elig()
	{
		System.out.println("Minimum Higher Secondary");	
	}
}
class Btech extends Degree
{
	void duration()
	{
		System.out.println("Exactly 4 Years");
	}
	void elig()
	{
		System.out.println("Science Branch in Higher Secondary");	
	}
}
