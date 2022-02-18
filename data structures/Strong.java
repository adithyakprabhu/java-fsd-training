import java.util.*;
class Strong
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      int i,fact,rem,sum=0,temp;
      System.out.println("Enter the number to check: ");
      int num=sc.nextInt();
      temp=num;
      while(num!=0)
      {
        i=1;
        fact=1;
        rem=num%10;
        while(i<=rem)
        {
          fact=fact*i;
          i++;
        }
        sum=sum+fact;
        num=num/10;
      }
    if(sum==temp)
    {
      System.out.println(+temp+" is a Strong number");
    }
    else
    {
      System.out.println(+temp+" is not a Strong number");
    }
  }
}
