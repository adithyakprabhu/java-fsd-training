//Enter string and input a no of characters and check their presence. 
import java.util.*;
class SecQn
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String s1;
    int i,res;
    System.out.println("Enter the string");
    s1 = sc.next();
    System.out.println("Enter the number of characters");
    int n = sc.nextInt();
    char[] arr = new char[n];
    System.out.println("Enter the characters");
    for(i=0;i<n;i++)
    {
      arr[i] = sc.next().charAt(0);
    }
    for(i=0;i<n;i++)
    {
      res = s1.indexOf(arr[i]);
      if(res==-1)
      {
        System.out.println(arr[i]+" Not available in the string");
      }
      else
      {
        System.out.println(arr[i]+" is available in the string");
      }
    }
  }
}
