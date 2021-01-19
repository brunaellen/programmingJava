/*Week 4 - Practical4A -Question8
Write a program using a while loop that will calculate and 
display the sum of all the numbers from 1 to n (inclusive), 
where n is determined by the user.
*/

import java.util.*;

public class CalculateSumNumbersToN
{
   public static void main(String []args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //declare counter variable
      int counter = 1, total = 0;
      int n;
      
      System.out.println("Enter the quantity of number you want to sum: ");
      n = keyboardIn.nextInt();
      
      while (counter <= n)
      {
         total = total + counter; 
         counter++;
      }
      System.out.println("Total of numbers from 1 to " + n + " is " + total);
   }
}