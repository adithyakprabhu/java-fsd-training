//Implement interface with 2 methods
import java.io.*;
public class SampleInterface implements University
{
	public static void main(String[] args)
	{
   SampleInterface u = new SampleInterface();
    u.display();
    u.courses();
	}

		public void display()
	  	{
	   		System.out.println("Calicut University");
	 	}
		public void courses()
		{
			System.out.println("Btech");
		}

}
interface University
{
  void display();
  void courses();
}
