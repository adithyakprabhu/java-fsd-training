import java.util.*;
class QueueEx
{
  public static void main(String[] args)
  {
    Queue<Integer> q = new LinkedList<>();
    for (int i = 0; i < 5; i++)
    {
      q.add(i); //add
    }
    System.out.println("Elements of queue "+ q);
    int removedele = q.remove(); //remove
    System.out.println("removed element-"+ removedele);
    System.out.println(q);
    int head = q.peek(); //peek
    System.out.println("head of q- "+head);
    int size = q.size(); //size
    System.out.println("Size of queue- "+ size);
    System.out.println("Elements Added using addALL function : ");
    Collections.addAll(q,10,20,30,40); //addALl
    System.out.println(q);
    q.remove(20);
    System.out.println("Element 20 removed from queue "+q);
    System.out.println("Is the queue empty? : "+q.isEmpty()); //isEmpty
    System.out.println("Does the queue contain 30? : "+q.contains(30)); //contains
  }
}
