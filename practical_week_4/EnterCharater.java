/*Week 4 - Practical4A -Question 10
Write a program using a while loop which will ask the user 
to enter any character from the keyboard.  
However when the user enters a ‘.’ (full stop) the program must terminate.  
Get the program to count how many characters the user entered 
*/

import java.util.*;

public class EnterCharater
{
   public static void main(String []args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      //declare counter variable
      int total = 0, counter = 1;
      int quantityOfNumberToSum = 10;
      char character, conditionToStopInsertCharacter = '.';
      
      System.out.println("Enter a character : ");
      character = keyboardIn.next().charAt(0);
      
      while (character != conditionToStopInsertCharacter)
      {
         System.out.println("Enter a character : ");
         character = keyboardIn.next().charAt(0);
         counter++;
      }
      
      total = total + counter;
      System.out.println("the number of characters you've entered was: " + total); 
   }
}