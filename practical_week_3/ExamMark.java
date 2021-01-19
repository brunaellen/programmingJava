/*Practical 3B - Question 3
Author : Bruna Ellen Gurgel Souza
Date: 04/01/21
Write a program that asks a user to enter an exam mark and 
then determines whether the student passed or failed the exam.  
To pass the exam the student must have gained 40 or greater
*/

//import package predefined of Scanner class
import java.util.Scanner;

//main class
public class ExamMark
{  //main method
   public static void main (String [] args)
   {  //create an instance of Scanner class
      Scanner keyboardIn = new Scanner(System.in);
      
      double examMark;
      double minimumExamMarkToPass = 40;
      final double maximunExamMark = 100;
      final int minimumMark = 0;
      
      //insert a input from keyboard
      System.out.print("Enter your exam Mark: ");
      examMark = keyboardIn.nextDouble();
      
      if (examMark >= minimumExamMarkToPass && examMark <= maximunExamMark)
      {
         System.out.print("You passed");
      }
      else if (examMark < minimumExamMarkToPass && examMark >= minimumMark)
      {
         System.out.print("failed");
      }
      else if (examMark < minimumMark || examMark > maximunExamMark)
      {
         System.out.print("You inserted an invalid mark");
      }
   }
}