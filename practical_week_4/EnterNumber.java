/*Week 4 - Practical4B -Question 1
Write a program that will repeatedly 
let a user enter any number until they enter the number 0.

*/

import java.util.*;

public class EnterNumber
{
   public static void main(String []args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      

      int number, conditionToStopInsertNumber = 0;

      do
      {
         System.out.println("Enter a number : ");
         number = keyboardIn.nextInt();
      
      } while (number != conditionToStopInsertNumber); 
   }     
} 