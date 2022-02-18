import java.util.*;
class Fibo
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n,a=0,b=1,c,i;
    System.out.println("Enter the limit: ");
    n = sc.nextInt();
    System.out.println("The Fibonacci Series up to the limit : ");
    for(i=1;i<=n;i++)
    {
      System.out.print(a+" ");
      c = a+b;
      a = b;
      b = c;
    }
  }
}
