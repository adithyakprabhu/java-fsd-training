class BankExc
{
  public static void main(String[] args)
  {
    try
    {
      int Initial = 200;
      int balance = 0;
      System.out.println(" "+(Initial/balance));
    }
    catch(ArithmeticException e)
    {
      System.out.println("Arithmetic Exception : balance is zero ");
    }
    finally
    {
      System.out.println("Try again later");
    }
  }
}
