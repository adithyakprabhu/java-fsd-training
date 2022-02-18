import java.util.*;
class StackDouble
{

public static void main(String[] args)
{
  Stack<Double> stk= new Stack<Double>();
  boolean result = stk.empty();
  System.out.println("Is the stack empty? " + result);
  stk.push(10.12);
  stk.push(11.23);
  stk.push(90.90);
  stk.push(120.31);
  System.out.println("Elements in Stack: " + stk);
  result = stk.empty();
  System.out.println("Is the stack empty? " + result);
  System.out.println("Last element is "+stk.peek());
  System.out.println("Position of 11.23 is "+stk.search(11.23));
  }
}
