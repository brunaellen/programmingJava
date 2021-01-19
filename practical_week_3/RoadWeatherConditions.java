/*Practical 3B - Question 2
Author : Bruna Ellen Gurgel Souza
Date: 04/01/21
program that asks a user to enter a temperature.  
If the temperature is less than 0 display message warning of freezing conditions,
otherwise display a message to say road conditions are fine
*/

//import package predefined of Scanner class
import java.util.Scanner;

//main class
public class RoadWeatherConditions
{  //main method
   public static void main (String [] args)
   {  //create an instance of Scanner class
      Scanner keyboardIn = new Scanner(System.in);
      
      //variable. integer type
      int temperature;
      int minimunSafeTemperature = 0;
      
      //assign value from keyboard 
      System.out.print("Enter the current temperature: ");
      temperature = keyboardIn.nextInt();
      
      //condition
      if (temperature < minimunSafeTemperature)
      {  //statement
         System.out.print("Warning. Freezing conditions");
      }
      //condition
      else
      {  //statement
         System.out.print("Road conditions are fine");
      }
   }//end of method 
}//end of main class