/*Week 4 - Practical4B -Question 3
Write a program that will repeatedly allow a user 
to enter a PIN number for their bankcard until they enter the correct number. 
(Create your own PIN number for this program).
*/

import java.util.*;

public class CheckPinNumber
{
   public static void main(String []args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      

      int createPinNumber, pinNumber;
      
      System.out.println("Create your pin number: ");
      createPinNumber = keyboardIn.nextInt();

      do
      {
         System.out.println("Insert your pin number: ");
         pinNumber = keyboardIn.nextInt();
      
      } while (pinNumber != createPinNumber); 
      System.out.println("Welcome! ");
   }     
}