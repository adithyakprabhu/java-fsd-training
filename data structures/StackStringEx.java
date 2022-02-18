import java.util.*;
class StackStringEx
{

public static void main(String[] args)
{
  Stack<String> stk= new Stack<String>();
  boolean result = stk.empty();
  System.out.println("Is the stack empty? " + result);
  stk.push("Hello");
  stk.push("This");
  stk.push("Is");
  stk.push("Adithya");
  System.out.println("Elements in Stack: " + stk);
  result = stk.empty();
  System.out.println("Is the stack empty? " + result);
  System.out.println("Last element is "+stk.peek());
  System.out.println("Position of Adithya is "+stk.search("Adithya"));
  }
}
