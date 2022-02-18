import java.io.*;
import java.util.*;
class BubbleSort
{
  public static void main(String[] args) {
    int n,i,j,t=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of elements");
    n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements");
    for(i=0;i<n;i++)
    {
      arr[i] =sc.nextInt();
    }
    for(i=0;i<n-1;i++)
    {
      for(j=0;j<n-i-1;j++)
      {
        if(arr[j] > arr[j+1])
        {
          t= arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = t;
        }
      }
    }
    System.out.println("After sorting");
    for(i=0;i<n;i++)
    {
      System.out.print(arr[i]+"  ");
    }
  }
}
