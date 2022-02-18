/*Write a program to take input of a String and convert it into a character array and reverse the array,
and to again make that reversed character array as a String and display it.*/
import java.io.*;
import java.util.*;
class CharArrayString
{
  public static void main(String[] args)
  {
    int i,j;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String s1 = sc.next();
    char[] arr = s1.toCharArray();
    char[] arr2 = new char[arr.length];
    j=arr.length-1;
    for(i=0;i<arr.length;i++)
      {
      arr2[i]=arr[j];
      j--;
      }
    System.out.println("The elements in Reversed string array are: ");
    for(i=0;i<arr2.length;i++)
    {
      System.out.print(arr2[i]+" ");
    }  System.out.println();
    StringBuilder s = new StringBuilder();
    for (i = 0; i < arr2.length; i++)
    {
      s.append(arr2[i]);
    }
    String reversed = s.toString();
    System.out.println("The reversed array in string format is "+reversed);
  }
}
