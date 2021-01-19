/*Practical 3C - Question 6
Author : Bruna Ellen Gurgel Souza
Date: 04/01/21
program to display the effect of pollen based on the pollen index 
entered by the user. Use the information given in the table below

Wind Speed (mph)	Category
Below 25	         Not a strong wind
25 – 38	         Strong wind
39 – 54	         Gale
55 – 72	         Whole gale
Above 72	         Hurricane

*/
import java.util.*;


public class PollenEffect
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //declare variable
      
      int pollenIndex;
      //ask user to enter the temperature
      System.out.print("Enter the pollen index: ");
      pollenIndex = keyboardIn.nextInt();
      
      if (pollenIndex < 10)
      {
         System.out.print("Effect: Pleasant ");
      }
      else if (pollenIndex >= 10 && pollenIndex <= 20)
      {
         System.out.print("Effect: Slightly unpleasant ");
      }
      else if (pollenIndex >= 21 && pollenIndex <= 30)
      {
         System.out.print("Effect: unpleasant ");
      }
      else 
      {
         System.out.print("Effect: Stay Inside ");
      }
   }
}
