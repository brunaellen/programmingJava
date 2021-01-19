/*Practical 3D - Question 1
Author : Bruna Ellen Gurgel Souza
Date: 04/01/21
Rewrite the following if-else if –else  into a switch statement.
Modify it to include a compound statement to take account of 
the user inputting a lower case letter, i.e S , s

*/

import java.util.*;


public class Status
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //declare variable
      
      String marriageStatus;

      System.out.print("Enter the first letter of your status: ");
      marriageStatus = keyboardIn.nextLine();
      
      switch (marriageStatus)
      {
         case "S": case "s":
         System.out.print("Single");
         break;
         
         case "M": case "m":
         System.out.print("Married");
         break;
         
         case "D": case "d":
         System.out.print("Divorced");
         break;
         
         case "W": case "w":
         System.out.print("Widowed");
         break;
         
         default:
         System.out.print("Error - invalid Code");
      }
   }
}
