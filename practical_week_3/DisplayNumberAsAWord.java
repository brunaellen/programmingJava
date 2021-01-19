/*Practical 3D - Question 2
Author : Bruna Ellen Gurgel Souza
Date: 05/01/21
2.	Write a program that reads in a single digit from the keyboard (digits 0 – 9)
and displays the value as a word, 
for example an input of 5 will display the word five.

*/

//import package predefined of Scanner class 
import java.util.Scanner;

// main class
public class DisplayNumberAsAWord
{  //main method
   public static void main (String [] args)
   {  //instance of Scanner class
      Scanner keyboardIn = new Scanner(System.in);
      
      //declare variable
      int number;
      
      //insert a input from keyboard
      System.out.print("Insert a number between 0 and 9: ");
      number = keyboardIn.nextInt();
      
      //switch expression
      switch (number)
      {  //clauses
         case 0:
         System.out.print("Zero");
         break;
         
         case 1:
         System.out.print("One");
         break;
         
         case 2:
         System.out.print("Two");
         break;
         
         case 3:
         System.out.print("Three");
         break;
         
         case 4:
         System.out.print("Four");
         break;
         
         case 5:
         System.out.print("Five");
         break;
         
         case 6:
         System.out.print("Six");
         break;
         
         case 7:
         System.out.print("Seven");
         break;
         
         case 8:
         System.out.print("Eight");
         break;
         
         case 9:
         System.out.print("Nine");
         break;
      }//end switch
   }//end method
}//end main class