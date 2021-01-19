/*Week 4 - Practical4B -Question 2
Parking costs €1. Write a program that will repeatedly allow 
a user to enter an amount of money (in cents) 
until they have entered €1 (100 cents). 
*/

import java.util.*;

public class ParkingCost
{
   public static void main(String []args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      

      int total = 0, number, conditionToStopInsertNumber = 100;

      do
      {
         System.out.println("Enter a amount of money in cents: ");
         number = keyboardIn.nextInt();
         total = total + number;
         number++;
      
      } while (total < conditionToStopInsertNumber); 
      System.out.println("you have inserted 1 euro! ");
   }     
} 