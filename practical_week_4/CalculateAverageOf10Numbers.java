/*Week 4 - Practical4A -Question 9
Write a program using a while loop that will ask a user to enter any 10 numbers 
and which will then calculate and display the average of the 10 numbers

*/

import java.util.*;

public class CalculateAverageOf10Numbers
{
   public static void main(String []args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //declare counter variable
      int total = 0, counter = 1, actuaNumber;
      int quantityOfNumberToSum = 10;
      double average;

      while (counter <= quantityOfNumberToSum)
      {
         System.out.println("Enter number " + counter + " :");
         actuaNumber = keyboardIn.nextInt();
      
         total = total + actuaNumber; 
         counter++;
      }
      average = (double)total/quantityOfNumberToSum;
      System.out.println("The average of the " + quantityOfNumberToSum + " numbers is: " +average); 
   }
}