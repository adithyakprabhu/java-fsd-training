/*program to take input two arrays and store the dissimilar elements into a resulant array.
sort the resultant array in a descending order using bubble sort.
dissimilar elements= the elements not occurring in both the arrays.(unique elements) */
import java.io.*;
import java.util.*;
class DissimilarBubble
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

    TreeSet<Integer> set = new TreeSet<>();
    for (int f:arr1)
    {
        set.add(f);
    }
    for (int k:arr2)
    {
        set.add(k);
    }
    System.out.println();

    System.out.println("The resultant array before Sorting");
    int len = set.size();
    Integer[] result = new Integer[len];
    result = set.toArray(result);
    System.out.println(Arrays.toString(result));
    for(i=0;i<len-1;i++)
    {
      for(j=0;j<len-i-1;j++)
      {
        if(result[j]<result[j+1])
        {
          t=result[j];
          result[j]=result[j+1];
          result[j+1]=t;
        }
      }
    }
    System.out.println("After sorting in Descending order");

    System.out.println(Arrays.toString(result));
  }
}
