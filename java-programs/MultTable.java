//Multiplication Table
import java.io.*;
import java.util.Scanner;
class MultTable
{
  public static void main(String[] args)
  {
    int n,i,l;
    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    //Enter Limit
    System.out.println("Enter the Limit");
    l = sc.nextInt();
    for(i=1;i<=l;i++)
    {
      int res = n*i;
      System.out.println(n+"*"+i+"="+res);
    }
  }
}
