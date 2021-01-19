/*Practical 3A - Question 2
Author : Bruna Ellen Gurgel Souza
Date: 30th/12/2020
Program that asks a user to enter an exam mark 
and then determines whether the student has passed the exam.  
To pass the exam the student must have gained a mark of 40 or greater. 
*/

//import packages cointaing predefined class (Scanner)
import java.util.*;

//main class
public class ExamMarks 
{  //main method
   public static void main(String [] args)
   {  //create a instance of Scanner class
      Scanner keyboardIn = new Scanner(System.in);
      
      //delcare variable
      int examMark;
      
      //assign value from keyboard
      System.out.print("Enter your exam mark: ");
      
      // read variable from keyboard
      examMark = keyboardIn.nextInt();
      
      //condition
      if (examMark >= 40 && examMark <= 100)
      {  //statement
         System.out.print("Passed the exam");
      }
      //condition 
      else if (examMark < 40) 
      {  //statement
         System.out.print("Failed");
      }
      //condition 
      else
      {  //statement
         System.out.print("incorrect Exam Mark!");
      }
   }//end main method
}//end main class