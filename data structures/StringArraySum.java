/*Write a program to input an array of string containing numbers, and to
convert the string array to an integer array and perform the sum of all the numbers.*/
import java.util.*;
import java.io.*;
class StringArraySum
{
  public static void main(String[] args)
  {
    System.out.println("Enter the size of the array");
    Scanner sc = new Scanner(System.in);
    int i,sum=0;
    int n = sc.nextInt();
    String[] strarr = new String[n];
    System.out.println("Enter the elements to the string array");
    for(i=0;i<n;i++)
    {
      strarr[i] = sc.next();
    }
    /*System.out.println("The contents of the string array is");
    for(i=0;i<n;i++)
    {
      System.out.print(strarr[i]+" ");
    } */
    System.out.println();
    int[] arr = new int[n];
    for(i=0;i<n;i++)
    {
      arr[i] = Integer.parseInt(strarr[i]);
    }
    System.out.println("Integer array is "+Arrays.toString(arr));
    for(i=0;i<n;i++)
    {
      sum+=arr[i];
    }
    System.out.println("Sum of the integer array is "+sum);
  }
}
