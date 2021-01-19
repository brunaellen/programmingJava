/*Practical 3C - Question 1
Author : Bruna Ellen Gurgel Souza
Date: 04/01/21
a program that shows students grade according with theirs exam marks
*/

import java.util.*;

public class Grades
{
   public static void main(String args[])
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      int mark;
      
      System.out.print("Enter your exam mark: ");
      mark = keyboardIn.nextInt();
      
      if(mark >=90 && mark <=100)
      {
         System.out.print("Grade A");
      }
      else if(mark >=80 && mark <=89)
      {
         System.out.print("Grade B");
      }
      else if(mark >=60 && mark <=79)
     {
         System.out.print("Grade C");
      }
      else if(mark >=40 && mark <=59)
      {
         System.out.print("Grade D");
      }
      else
      {
         System.out.print("Grade E");
      }
   }
}
