/*Write a program to input a double dimensional array of String in the following manner:
i)the names of students
ii)the their total marks
and to check if the Student has passed if he has more than 400 marks,
else print the student has failed. */

import java.util.*;
class StudentMark
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      int i,j;
      System.out.println("Enter the number of rows");
      int row = sc.nextInt();
      System.out.println("Enter the number of columns");
      int col = sc.nextInt();
      String[][] arr1 = new String[row][col];
      System.out.println("Enter the names and marks ");
      for(i=0;i<row;i++)
      {
        for(j=0;j<col;j++)
        {
          arr1[i][j] = sc.next();
        }
      }
      System.out.println("The values entered are");
      for(i=0;i<row;i++)
      {
        for(j=0;j<col;j++)
        {
          System.out.print(arr1[i][j]+"  ");
        } System.out.println("");
      }
      for(i=1;i<row;i++)
      {
        for(j=0;j<col;j++)
        {
          int temp = Integer.parseInt(arr1[i][j]);
          if(temp>400)
          {
            System.out.println((arr1[i-1][j])+" has Passed the test");
          }
          else
          {
            System.out.println((arr1[i-1][j])+" has not passed the test");
          }
        }
      }
    }
  }
