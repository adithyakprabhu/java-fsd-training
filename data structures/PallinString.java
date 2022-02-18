/*Write a program to take an input of a string with multiple words and convert it into a string array,
and check if every element of that array is a Palindrome.*/
import java.util.*;
import java.lang.*;
class PallinString
{
 public  static boolean PalindromeC(String s)
 {
 	int i = 0, j = s.length() - 1;
        while (i < j)
        {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }


        return true;
    }


 public static void main(String[] args)
 {
 	Scanner sc = new Scanner(System.in);
 	String s1;
 	System.out.println("Enter the string value :");
 	s1=sc.nextLine();
 	System.out.println(s1);
 	String strArray[] = s1. split(" ");
 	int n=strArray.length;
 	System.out.println("The string array");
 	for(int i=0;i<n;i++)
    {
	System.out.println(strArray[i]);
    }
    for(int i=0;i<n;i++)
    {
    	String str = strArray[i];
    	if (PalindromeC(str))
    	{
    		System.out.println("Yes the string "+ "'" +strArray[i]+ "'"+ " is Palindrome " );
    	}
        else
        {
        	System.out.println("No, string " + "'" +strArray[i]+ "'"+"is  not  Palindrome ");
    	  }
      }
    }
}
