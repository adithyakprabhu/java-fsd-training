import java.util.*;
class Rev
{
  public static void main(String[] args)
  {
      String a, b = "";
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the string you want to reverse:");
      a = sc.next();
      int n = a.length();
      for(int i=n-1;i>=0;i--) //reverse iteration loop
      {
          b = b + a.charAt(i);
      }
      System.out.println("Reversed String is: ");
      System.out.println(b);
    }
}
