/*Week 4 - Practical4A -Question7
Write a program using a while loop that will calculate and 
display the sum of all the numbers between 10 and 100 inclusive
 */

public class CalculateSumNumbers
{
   public static void main(String []args)
   {
      //declare counter variable
      int lastNumber = 100;
      int actualNumber = 10;
      int total = 0;
      
      while (actualNumber <= lastNumber)
      {
         total = total + actualNumber;
         actualNumber++;
      }
      System.out.println("Total of numbers from 10 to 100 is " + total);
   }
}