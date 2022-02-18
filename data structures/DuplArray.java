//Print Duplicate elements in an array
import java.util.*;
public class DuplArray
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int i,j;
    System.out.println("enter the size of the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements into the array: ");
    for(i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    System.out.println("The duplicate elements in the array are: ");
    for(i=0;i<n;i++)
    {
      for(j=i+1;j<n;j++)
      {
        if(arr[i]==arr[j])
        {
          System.out.print(arr[i]+" ");
        }
      }
    }
  }
}
