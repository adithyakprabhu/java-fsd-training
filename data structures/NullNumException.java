//Nested Try Catch to implement Null Exception and Number format Exception
class NullNumException
{
  public static void main(String[] args)
  {
      try //outer try
      {
        try //inner try
        {
          String str = null;
          System.out.println("Size of string is "+str.length());
        }
        catch(ArithmeticException e)
        {
          System.out.println("Arithmetic Exception has occured");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
          System.out.println("Array Index Out Of Bounds Exception has occured");
        }
        catch(NullPointerException e)
        {
          System.out.println("Null Exception");
        }
        String str ="1.23";
        int a = Integer.parseInt(str);
      }//end of outer try
      catch(ArithmeticException e)
      {
        System.out.println("Arithmetic Exception has occured");
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
        System.out.println("Array Index Out Of Bounds Exception has occured");
      }
      catch(NumberFormatException e)
      {
        System.out.println("Number format Exception");
      }
    }
  }
