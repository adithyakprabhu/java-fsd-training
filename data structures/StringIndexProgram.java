//Try Catch block for string index out of bounds
class StringIndexProgram
{
  public static void main(String[] args)
  {
    try
    {
      String s = "Hello Good morning";
      System.out.println(" "+s.charAt(30));
    }
    catch(StringIndexOutOfBoundsException e)
    {
      System.out.println("String index is out of bounds");
    }
    System.out.println("The Try Catch block is executed");
  }
}
