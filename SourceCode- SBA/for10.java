import java.io.*;
import java.util.*;
class for10
{
  public static void main(String[] args)
  {
    int i;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the limit of array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements to the array");
    for(i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    System.out.println("The elements are :");
    for(i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}
