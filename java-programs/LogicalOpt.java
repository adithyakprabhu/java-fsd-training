//Operators Logical AND and Logical OR
import java.io.*;
class LogicalOpt
{
    public static void main(String[] args)
    {
        int a,b,c,d;
        a=1; b=2; c=0; d=4;
        if((a>b||a>c)&&(b>a||b<d))
        {
          System.out.println("HELLO");
        }
        if((((a+b)>2) && ((b+c)<d)) || (((b+d)>0) && ((c+d)<a)))
        {
          System.out.println("Hi");
        }
        else
        {
          System.out.println("Bye");
        }
    }
}
