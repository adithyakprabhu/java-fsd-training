import java.util.*;
class SubString
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String s1;
    String s2;
    System.out.println("Enter the two strings");
    s1 = sc.next();
    s2 = sc.next();
    int result =s1.indexOf(s2);
   if(result == -1)
   {
     System.out.println(s1 + " is not a SubString of the string");
   }
   else
   {
     System.out.println(s2 + " is a SubString of the string, and is at position "+(result+1));
   }
 }
}
