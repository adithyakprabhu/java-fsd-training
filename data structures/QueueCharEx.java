import java.util.*;
class QueueCharEx
{
  public static void main(String[] args)
  {
    Queue<Character> q = new LinkedList<>();
      q.add('a');
      q.add('b');
      q.add('c');
      q.add('d');//add

    System.out.println("Elements of queue "+ q);
    char removedele = q.remove(); //remove
    System.out.println("removed element : "+ removedele);
    System.out.println(q);
    char head = q.peek(); //peek
    System.out.println("head of q- "+head);
    int size = q.size(); //size
    System.out.println("Size of queue- "+ size);
    System.out.println("Elements Added using addALL function : ");
    Collections.addAll(q,'q','r','s','t'); //addALl
    System.out.println(q);
    q.remove('s');
    System.out.println("Element s removed from queue "+q);
    System.out.println("Is the queue empty? : "+q.isEmpty()); //isEmpty
    System.out.println("Does the queue contain r? : "+q.contains('r')); //contains
  }
}
