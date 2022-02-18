//Enter char array and find ascii value of each character
import java.util.*;
import java.io.*;
class AsciiArray
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int i,asciic;
    System.out.println("Enter the size of the array");
    int n = sc.nextInt();
    char[] arr = new char[n];
    System.out.println("Enter the elements to the array");
    for(i=0;i<n;i++)
    {
      arr[i] = sc.next().charAt(0);
    }
    System.out.println("The ASCII VALUE ");
    for(i=0;i<n;i++)
    {
      asciic=arr[i];
      System.out.println("of "+arr[i]+ " is "+asciic);
    }
  }
}
