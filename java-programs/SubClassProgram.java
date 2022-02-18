//Subclass in a different package

import java.io.*;
package One;
class SubClassProgram
{
	public static void main(String[] args)
	{
		System.out.println("This is Java");
	}
}
class Sample1 extends SubClassProgram
{
	public static void display()
	{
		System.out.println("This is Java");
	}
}

package Two;
class Test1 extends SubClassProgram
{
	public static void display2()
	{
		System.out.println("Subclass is invoked");
	}
}