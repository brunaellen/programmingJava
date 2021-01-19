/*Practical 3D - Question 5
Author : Bruna Ellen Gurgel Souza
Date: 05/01/21
Write a program that will allow a user to enter a character and 
which will then display the corresponding suite of card for that character

Character	Card
C or c	Club
D or d	Diamond
H or h	Heart
S or s	Spade
Any other character	No matching card

*/


//import package predefined of Scanner class 
import java.util.Scanner;

// main class
public class SuiteOfCards
{  //main method
   public static void main (String [] args)
   {  //instance of Scanner class
      Scanner keyboardIn = new Scanner(System.in);
      
      //declare variable
      String letter;
      
      //insert a input from keyboard
      System.out.print("Enter the first letter of your playing card: ");
      letter = keyboardIn.nextLine();
      
      //switch expression
      switch (letter)
      {  //clauses
         case "C": case "c":
         System.out.print("Club");
         break;
         
         case "D": case "d":
         System.out.print("Diamond");
         break;
         
         case "H": case "h":
         System.out.print("Heart");
         break;
         
         case "S": case "s":
         System.out.print("Spade");
         break;
         
         default:
         System.out.print("No matching card");
         
      }//end switch
   }//end method
}//end main class