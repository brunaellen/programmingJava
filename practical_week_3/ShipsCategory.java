/*Practical 3D - Question 3
Author : Bruna Ellen Gurgel Souza
Date: 05/01/21
3.	Write a program that will display the category of ships as follows:

Category	Type of ship
B , b	Battleship
C, c	Cruiser
D, d	Destroyer
E, e	Frigate
Any other letter	No such ship found
*/

//import package predefined of Scanner class 
import java.util.Scanner;

// main class
public class ShipsCategory
{  //main method
   public static void main (String [] args)
   {  //instance of Scanner class
      Scanner keyboardIn = new Scanner(System.in);
      
      //declare variable
      String shipCategory;
      
      //insert a input from keyboard
      System.out.print("Enter the first letter of your Ship category: ");
      shipCategory = keyboardIn.nextLine();
      
      //switch expression
      switch (shipCategory)
      {  //clauses
         case "B": case "b":
         System.out.print("Battleship");
         break;
         
         case "C": case "c":
         System.out.print("Cruiser");
         break;
         
         case "D": case "d":
         System.out.print("Destroyer");
         break;
         
         case "E": case "e":
         System.out.print("Frigate");
         break;
         
         default:
         System.out.print("No such ship found");
         
      }//end switch
   }//end method
}//end main class
