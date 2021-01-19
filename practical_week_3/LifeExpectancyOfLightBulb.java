/*Practical 3D - Question 6
Author : Bruna Ellen Gurgel Souza
Date: 05/01/21
Write a program that asks a user to enter the wattage of a light bulb 
and which will then determine the life expectancy of the bulb.

Watts	Life expectancy (hours)
25	                     2500
40 or 60	               1000
75 or 100	            750
Any other value	      0
*/

//import package predefined of Scanner class 
import java.util.Scanner;

// main class
public class LifeExpectancyOfLightBulb
{  //main method
   public static void main (String [] args)
   {  //instance of Scanner class
      Scanner keyboardIn = new Scanner(System.in);
      
      //declare variable
      int wattage;
      
      //insert a input from keyboard
      System.out.print("Enter the wattage of your light bulb: ");
      wattage = keyboardIn.nextInt();
      
      //switch expresion
      switch (wattage)
      {  //clauses
         case 25:
         System.out.print("the life expectancy of the bulb is\n 2500 hours" );
         break;
         
         case 40: case 60:
         System.out.print("the life expectancy of the bulb is\n 1000 hours");
         break;
         
         case 75: case 100:
         System.out.print("the life expectancy of the bulb is\n 750 hours");
         break;
         
         default:
         System.out.print("the life expectancy of the bulb is\n 0 hours");
      }//end switch
   }//end method
}//end main class