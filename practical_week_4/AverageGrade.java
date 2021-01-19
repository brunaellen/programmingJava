//program to  calculate the average of 10 grades

import java.util.*;

public class AverageGrade
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //declare variables
      int  counter = 1, total = 0, grade;
      double average;
      //read in 10 grades
      while(counter <= 10) //while counter is less than 11
      {
         System.out.print("Enter grade no " + counter +": " );
         grade = keyboardIn.nextInt();
         total = total + grade; ///add current grade to total 
         counter++;
      }//end while
      //calc average
      
      average = (double)total/10; //note use of cast
      System.out.println("Average grade is " +average); 
        
   } //end main
} //end class