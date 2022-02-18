//Reverse elements of a string array and print the Reversed array
import java.util.*;
class ReverseStringArray
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int i,j;
    System.out.println("Enter the size of the array: ");
    int n = sc.nextInt();
    String[] arr1 = new String[n];
    String[] arr2 = new String[n];
    System.out.println("Enter the elements:");
    for(i=0;i<n;i++)
    {
      arr1[i] =sc.next();
    }
    System.out.println("The elements in the string array:");
    for(i=0;i<n;i++)
    {
      System.out.print(arr1[i]+" ");
    }
    System.out.println();
    j=n-1;
    for(i=0;i<n;i++)
      {
      arr2[i]=arr1[j];
      j--;
      }
    System.out.println("The elements in Reversed string array are: ");
    for(i=0;i<n;i++)
    {
      System.out.print(arr2[i]+" ");
    }
  }
}
