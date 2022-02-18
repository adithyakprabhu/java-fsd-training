//PRIME NUMBER
import java.io.*;
import java.util.Scanner;
class PrimeNo
{
  public static void main(String[] args)
  {
    int n,i,f=0;
    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for(i=1;i<=n;i++)
    {
      if(n%i==0)
      {
        f++;
      }
    }
    if(n==0 || n==1) // 0 and 1 case
    {
      System.out.println(n+" is not Prime not Composite");
    }
    else if(f==2)
    {
      System.out.println(n+" is a prime number");
    }
    else
    {
      System.out.println(n+" is not a prime number");
    }
  }
}
