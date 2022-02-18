/*Program to take input of two integer arrays from the user and to find the sum of both the arrays.
Sort the elements of the resultant array in ascending order using selection sort. */
import java.io.*;
import java.util.*;
class SelectionSum
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n,i,j,t=0;
    System.out.println("Enter the number of elements in the array");
    n = sc.nextInt();
    System.out.println("Enter elements into the first array");
    int[] arr1 = new int[n];
    for(i=0;i<n;i++)
    {
      arr1[i] = sc.nextInt();
    }
    System.out.println("Enter elements into the second array");
    int[] arr2 = new int[n];
    for(i=0;i<n;i++)
    {
      arr2[i] = sc.nextInt();
    }
    int[] arr3 = new int[n];
    for(i=0;i<n;i++)
    {
      arr3[i] = arr1[i]+arr2[i];
    }
    System.out.println("Sum of both the arrays");
    for(i=0;i<n;i++)
    {
      System.out.print(arr3[i]+" ");
    }
    System.out.println();
    System.out.println("The resultant array after sorting: ");

    for(i=0;i<n;i++)
    {
      for(j=i+1;j<n;j++)
      {
        if(arr3[i]>arr3[j])
        {
          t=arr3[i];
          arr3[i]=arr3[j];
          arr3[j]=t;
        }
      }
    }
    for(i=0;i<n;i++)
    {
      System.out.print(arr3[i]+"  ");
    }
  }
}
