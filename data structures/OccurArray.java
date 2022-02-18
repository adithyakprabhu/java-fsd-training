//Occurence of a particular integer in an array
import java.util.*;
public class OccurArray
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int i,ele,c=0;
    System.out.println("Enter the size of the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements into the array: ");
    for(i=0;i<n;i++)
    {
      arr[i] = sc.nextInt();
    }
    System.out.println("Enter the integer to find its occurence");
    ele = sc.nextInt();
    System.out.println("The integer occurs at positions :");
    for(i=0;i<n;i++)
    {
      if(arr[i]==ele)
      {
        c++;
        System.out.print(i+1+"  ");
      }
    } System.out.println();
    System.out.println("The integer occurs "+c+" times in the array ");
  }
}
