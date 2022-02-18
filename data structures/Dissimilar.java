import java.io.*;
import java.util.*;
class Dissimilar
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
    ArrayList<Integer> arr3 = new ArrayList<Integer>();
    for(i=0;i<n;i++)
    {
      for(j=0;j<n;j++)
      {
        if(arr1[i]!=arr2[j])
        {
          arr3.add(arr1[i]);
          break;
        }
      }
    }
    System.out.println();
    System.out.println("The resultant array before Sorting");
    /*for(int f:arr3)
	    {
	    	System.out.print(f+" ");
	    }*/
    System.out.println();
    int len = arr3.size();
    Integer[] result = new Integer[len];
    result = arr3.toArray(result);
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
    System.out.println("After sorting in Ascending order");
    System.out.println(Arrays.toString(result));
  }
}
