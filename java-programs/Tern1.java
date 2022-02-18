//Ternary for greatest of 3 no's
import java.io.*;
import java.util.Scanner;
class Tern1
{
  public static void main(String[] args)
  {
    int a,b,c,t,maximum;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the three numbers:");
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      t = a>b?a:b;
      maximum = c>t?c:t;
    System.out.println("greatest no is :"+maximum);
  }
}
