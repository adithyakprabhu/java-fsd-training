import java.util.*;
class StackChar
{

public static void main(String[] args)
{
  Stack<Character> stk= new Stack<Character>();
  boolean result = stk.empty();
  System.out.println("Is the stack empty? " + result);
  stk.push('A');
  stk.push('b');
  stk.push('c');
  stk.push('d');
  System.out.println("Elements in Stack: " + stk);
  result = stk.empty();
  System.out.println("Is the stack empty? " + result);
  System.out.println("Last element is "+stk.peek());
  System.out.println("Position of c is "+stk.search('c'));
  }
}
