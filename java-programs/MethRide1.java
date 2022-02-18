//Method Overriding 1
package Training_java;

public class MethRide1 {
	public static void main(String[] args)
	{
		//First Parent Overriding
		Car c= new Bugatti();
		c.fast();
		c.weight();
		//Second Parent overriding
		Fruit f = new Watermelon();
		f.benefit();
		f.taste();
		
	}
}
class Car
{
	void fast()
	{
		System.out.println("Car goes fast");
	}
	void weight()
	{
		System.out.println("Weight is more than 1500kg");
	}
}
class Bugatti extends Car
{
	void fast()
	{
		System.out.println("Bugatti goes very fast");
	}
	void weight()
	{
		System.out.println("Weight of Bugatti is 1990kg");
	}
}

class Fruit
{
	void benefit()
	{
		System.out.println("Fruits are Healthy");
	}
	void taste()
	{
		System.out.println("Fruits are good in taste");
	}
}
class Watermelon extends Fruit
{
	void benefit()
	{
		System.out.println("Watermelon Helps you stay hydrated");	
	}
	void taste()
	{
		System.out.println("Watermelon is Bitter-Sweet");
	}
}
