package Training_java;

public class MultiLev
{
	public static void main(String[] args)
	{
		MulC2 x= new MulC2();
		x.disp();
		x.disp1();
		x.disp2();
	}
}
class MulC
{
	void disp()
	{
		System.out.println("This is super class");
	}
}
class MulC1 extends MulC
{
	void disp1()
	{	
	System.out.println("This is sub class-1");
	}
}
class MulC2 extends MulC1
{
	void disp2()
	{	
	System.out.println("This is sub class-2");
	}
}
