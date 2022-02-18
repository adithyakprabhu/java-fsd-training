import java.util.*;
class PrioQueue
{
	public static void main(String args[])
	{
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		p.add(10);
		p.add(20);
		p.add(15);
    p.add(30);
		System.out.println("FIrst element "+p.peek());
		System.out.println("Fetch and remove first"+p.poll());
    System.out.println("After Removing top element");
		System.out.println(p.peek());
    System.out.println("Does the PriorityQueue contain 20? :" +p.contains(20));
    p.remove(30);
    System.out.println("After removing 30 : "+p);
	}
}
