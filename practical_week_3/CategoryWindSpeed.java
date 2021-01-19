/*Practical 3C - Question 5
Author : Bruna Ellen Gurgel Souza
Date: 04/01/21
Weather Station uses the information below to determine the category of wind
depending on the wind speed.Write a program that will allow a user to enter 
a wind speed and display the category of wind corresponding to that speed

Wind Speed (mph)	Category
Below 25	         Not a strong wind
25 – 38	         Strong wind
39 – 54	         Gale
55 – 72	         Whole gale
Above 72	         Hurricane

*/

import java.util.*;


public class CategoryWindSpeed
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //declare variable
      
      int windSpeed;
      //ask user to enter the temperature
      System.out.print("Enter current wind spped: ");
      windSpeed = keyboardIn.nextInt();
      
      if (windSpeed < 25)
      {
         System.out.print("Category: Not a strong wind ");
      }
      else if (windSpeed >= 25 && windSpeed <= 38)
      {
         System.out.print("Category: Strong wind ");
      }
      else if (windSpeed >= 39 && windSpeed <= 54)
      {
         System.out.print("Category: Gale ");
      }
      else if (windSpeed >= 55 && windSpeed <= 72)
      {
         System.out.print("Category: Whole gale ");
      }
      else 
      {
         System.out.print("Category: Hurricane ");
      }
   }
}
