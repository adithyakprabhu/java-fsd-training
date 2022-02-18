//Print Greatest elements in an array
import java.util.*;
public class GreatestArray
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int i,greatest=0;
    System.out.println("Enter the size of the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements into the array: ");
    for(i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    System.out.println("The greatest element in the array is: ");
    greatest = arr[0];
    for(i=0;i<n;i++)
    {
      if(greatest<arr[i])
      {
        greatest = arr[i];
      }
    }
    System.out.println(greatest);
  }
}
