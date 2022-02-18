//Array list of double elements, add the elements and sort in descending order
import java.util.*;
class ArrayListDouble
{
  public static void main(String[] args)
  {
    Double sum=0.0;
    ArrayList<Double> list = new ArrayList<Double>();
    list.add(20.99);
    list.add(12.05);
    list.add(17.34);
    list.add(89.10);
    System.out.println("The values in the arraylist are ");
    System.out.println(list);
    for(Double i:list)
    {
      sum = sum+i;
    }
    System.out.println("Sum of the elements is:");
    System.out.println(sum);
    Collections.sort(list,Collections.reverseOrder());
    System.out.println("The elements in descending order are "+list);
  }
}
