//Method Overloading 1
package Training_java;

public class MethOver1 {
	
	public static void main(String[] args)
	{
		add(100,20);
		sub(12.23,10.12);
		add(10,12.5);
		sub(20,10);	
		
	}
	static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	static void add(double a,double b)
	{
		System.out.println(a+b);
	}
	static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	static void sub(double a,double b)
	{
		System.out.println(a-b);
	}
		
}
