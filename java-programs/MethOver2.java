//Method Overloading 2
package Training_java;

public class MethOver2 {


static int Mul(int x, int y) 
	{
	  return x * y;
	}

static int Div(int x, int y) 
{
  return x / y;
}

static double Mul(double x, double y) 
	{
	  return x * y;
	}

static double Div(double x, double y) 
{
  return x / y;
}
	public static void main(String[] args) 
	{
	  int myNum1 = Mul(7,2);
	  double myNum2 = Mul(2.1, 2.29);
	  int myNum3= Div(8,2);
	  double myNum4=Div(4.2,2.2);
	  System.out.println("Product int: " + myNum1);
	  System.out.println("Product double: " + myNum2);
	  System.out.println("Quotient int: " + myNum3);
	  System.out.println("Quotient Double: " + myNum4);
	  
	}
}