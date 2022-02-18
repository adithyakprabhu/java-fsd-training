//Student Attendance
import java.io.*;
import java.util.Scanner;
class AttendStudent
{
  public static void main(String[] args)
  {
    double held,attended;
    double percentage=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of classes held");
    held = sc.nextInt();
    System.out.println("Enter the number of classes attended");
    attended = sc.nextInt();
    percentage = (attended/held) * 100;
    if(percentage >= 75)
    {
      System.out.println("Student is eligible for the exams - Attendance :"+percentage);
    }
    else
    {
      System.out.println("Student is not eligible for the exams - Attendance :"+percentage);
    }
  }
}
