//Program with 2 abstract methods and 1 non abstract method.
import java.io.*;
class SampleAbstract
{
  public static void main(String[] args)
  {
    Fruit f = new Mango();
    f.name();
    f.colour();
    f.taste();
  }
}
abstract class Fruit
{
  abstract void name();
  abstract void colour();
  void taste()
  {
    System.out.println("It is Sweet");
  }
}
class Mango extends Fruit
{
  void name()
  {
    System.out.println("The name is Mango");
  }
  void colour()
  {
    System.out.println("Yellow and Green");
  }
}
