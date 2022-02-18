//Implement interface with 2 methods
import java.io.*;
public class SampleIntf
{
	public static void main(String[] args)
	{
    University u = new Uoc();
    u.display();
    Degree x = new Course();
    x.courses();

	}
}
interface University
{
  void display();
}
interface Degree
{
  void courses();
}

class Uoc implements University
{
  public void display()
  {
    System.out.println("Calicut University");
  }
}
class Course implements Degree
{
  public void courses()
	{
		System.out.println("Btech");
	}
}
