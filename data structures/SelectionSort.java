import java.io.*;
import java.util.*;
class SelectionSort
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
    for(i=0;i<n;i++)
    {
      for(j=i+1;j<n;j++)
      {
        if(arr[i] > arr[j])
        {
          t= arr[i];
          arr[i] = arr[j];
          arr[j] = t;
        }
      }
    }
    System.out.println("after sorting");
    for(i=0;i<n;i++)
    {
      System.out.print(arr[i]+"  ");
    }
  }
}
