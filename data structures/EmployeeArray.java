/*5. Write a program to input the following details:
i)Employee Name
ii)Employee Salary
iii)Employee Year of joining

Calculate the Loyalty bonus of the Employee's by
a)if the year of their joining is on or before than 2017,and their Salary is more than 30000/-,
then the bonus will be 22% of the salary.
b)if the year of their joining is on or before than 2017,and their Salary is less than 30000/-,
then the bonus will be 33% of the salary.
c)if the year of their joining is on or before than 2012,
then the bonus will be 40% of the salary.
d)if the year of their joining is after 2017,and their Salary is less than 30000/-,
then the bonus will be 15% of the salary.
e)if the year of their joining is after 2017,and their Salary is more than 30000/-,
then the bonus will be 10% of the salary.
*/
import java.util.*;
public class EmployeeArray
{
  public static void main(String[] args)
  {
      int n,i;
      String[] name= new String[20];
      int[] salary = new int[10];
      int[] yoj = new int[5];
      double[] bon = new double[10];
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of employees");
      n = sc.nextInt();
      int[] arr = new int[n];
      for(i=0;i<n;i++)
      {
      System.out.println("Enter your name: ");
      name[i] = sc.next();
      System.out.println("Enter your salary: ");
      salary[i] = sc.nextInt();
      System.out.println("Enter your year of joining: ");
      yoj[i] = sc.nextInt();
      System.out.println("Loyalty bonus for " +name[i]+" is: ");

      if(yoj[i]<=2007 && salary[i]>30000)
      {
        bon[i] = (salary[i]*22)/100;
      }
      else if(yoj[i]<=2007 && salary[i]<30000)
      {
        bon[i] = (salary[i]*33)/100;
      }
      else if(yoj[i]<=2012)
      {
        bon[i] = (salary[i]*40/100);
      }
      else if(yoj[i]>=2017 && salary[i]<30000)
      {
        bon[i] = (salary[i]*15)/100;
      }
      else if(yoj[i]>=2017 && salary[i]>30000)
      {
        bon[i] = (salary[i]*10)/100;
      }
      System.out.println(""+bon[i]);
    }
  }
}
