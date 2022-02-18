import java.util.*;
class StackEx{

public static void main(String[] args)
{
//creating an instance of Stack class
  Stack<Integer> stk= new Stack<Integer>();
// checking stack is empty or not
  boolean result = stk.empty();
  System.out.println("Is the stack empty? " + result);
// pushing elements into stack
  stk.push(78);
  stk.push(113);
  stk.push(90);
  stk.push(120);
//prints elements of the stack
  System.out.println("Elements in Stack: " + stk);
  result = stk.empty();
  System.out.println("Is the stack empty? " + result);
  System.out.println("Last element is "+stk.peek());
  System.out.println("Position of 90 is "+stk.search(90));
  }
}
