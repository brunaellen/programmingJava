/*Practical 3D - Question 4
Author : Bruna Ellen Gurgel Souza
Date: 05/01/21
Write a program to input a character for a pack of playing cards 
and displays the following depending on the letter entered:

Character	Playing card
J or j	Jack
Q or q	Queen
K or k	King
Any other letter	No matching card

*/

//import package predefined of Scanner class 
import java.util.Scanner;

// main class
public class PlayingCards
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
         case "J": case "j":
         System.out.print("Jack");
         break;
         
         case "Q": case "q":
         System.out.print("Queen");
         break;
         
         case "K": case "k":
         System.out.print("King");
         break;
         
         default:
         System.out.print("No matching card");
         
      }//end switch
   }//end method
}//end main class
