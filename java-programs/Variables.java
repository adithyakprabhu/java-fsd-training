package training;

public class Variables {
	int myInst;
	static int stVar=1;
	
	public static void main(String[] args)
	{
		int x=2;
			
		System.out.println("Value of static stVar"+stVar);
		System.out.println("Value of local variable x:"+x);
		
	}
	
	public void display()
	{
		System.out.println("Value of instance myInst:"+myInst);
	}

}
