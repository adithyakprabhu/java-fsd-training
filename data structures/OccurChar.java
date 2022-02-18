/*Write a program to check for the occurance of a particular character in a string and display howmany times it has occured.
note: take the String  and the character to be checked as a input from the user. */
import java.io.*;
import java.util.*;
class OccurChar
{
  public static void main(String[] args)
  {
    int count=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    String st = sc.next();
    System.out.println("Enter the character");
    char ch = sc.next().charAt(0);
    for(int i=0;i<st.length();i++)
    {
      if(st.charAt(i) == ch)
      {
        count++;
      }
    }
    if(count == 0)
    {
      System.out.println("The character "ch+" is Not present in the string");
    }
    System.out.println("The character  "ch+" is present in the String "+count+ " times");
  }
}
