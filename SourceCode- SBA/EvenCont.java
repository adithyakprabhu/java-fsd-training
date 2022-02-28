import java.io.*;
import java.util.*;
class EvenCont
{
  public static void main(String[] args)
  {
    int i,sum=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the limit of array");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements to the array");
    for(i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
      if(arr[i]%2!=0)
      {
        continue;
      }
      sum+=arr[i];
    }
    System.out.println("The sum of the even elements are :"+sum);
  }
}
