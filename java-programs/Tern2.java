//Ternary for smallest of 3 no's
import java.io.*;
import java.util.Scanner;
class Tern2
{
  public static void main(String[] args)
  {
    int a,b,c,t,minimum;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the three numbers:");
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      t = a<b?a:b;
      minimum = c<t?c:t;
    System.out.println("Smallest no is :"+minimum);
  }
}
