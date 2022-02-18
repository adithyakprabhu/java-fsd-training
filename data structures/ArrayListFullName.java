/*Create two arraylist of strings to take First_name and Last_name of the students,
and print their whole name. */
import java.util.*;
class ArrayListFullName
{
  public static void main(String[] args)
  {
    ArrayList<String> list1 = new ArrayList<String>();
    ArrayList<String> list2 = new ArrayList<String>();
    ArrayList<String> list3 = new ArrayList<String>();
    list1.add("Vinicius");
    list1.add("Karim");
    list1.add("Eden");
    list1.add("David");
    list2.add("Junior");
    list2.add("Benzema");
    list2.add("Hazard");
    list2.add("Alaba");
    for(int i=0;i<list1.size();i++)
    {
      list3.add(list1.get(i) + " " + list2.get(i));
    }
    System.out.println("The values in the arraylist are ");
    System.out.println(list3);
  }
}
