//Sum and Avg of integer ArrayList
import java.util.*;
class ArrayListSumAvg
{
  public static void main(String[] args)
  {
    int sum=0;
    float avg;
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(20);
    list.add(12);
    list.add(17);
    list.add(89);
    System.out.println("The values in the arraylist are ");
    System.out.println(list);
    for(int i=0;i<list.size();i++)
    {
      sum = sum+list.get(i);
    }
    avg = (float) sum/list.size();
    System.out.println("Sum of the elements is :"+sum);
    System.out.println("Average of elements is : "+avg);
  }
}
