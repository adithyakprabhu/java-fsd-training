import java.util.Scanner;
class Duck
{
    public static void main(String[] args)
     {
        String num;
        boolean Duck;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.next();
        if(num.charAt(0)=='0')
        {
          Duck = false;
        }
        else
        {
          Duck = false;
          for(int i=1;i<num.length();i++)
          {
            if(num.charAt(i)=='0')
            {
              Duck=true;
              break;
            }
          }
        }
        if(Duck)
        {
            System.out.println(num+" is a duck number");
        }
        else
        {
            System.out.println(num+" is not a duck number");
        }
    }
}
