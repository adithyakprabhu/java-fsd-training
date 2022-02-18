//Company Bonus
import java.io.*;
import java.util.Scanner;
class CompBonus
{
  public static void main(String[] args)
  {
    //CompBonus c = new CompBonus();
    double salary,years;
    double bonus=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your salary");
    salary = sc.nextInt();
    System.out.println("Enter the number of years you've worked");
    years = sc.nextInt();
    bonus = Employeebonus(salary,years);
    System.out.println("Bonus Amount is :"+bonus);

  }

  static double Employeebonus(double x, double y)
  {
    if(y>5)
    {
      double Bonus_calc = (x*5)/100;
      return Bonus_calc;
    }
    else
    {
      System.out.println("Not Eligible for bonus");
    } return 0;
  }
}
