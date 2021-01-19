/* Practical 2 - Question 2
Author: Bruna Ellen Gurgel Souza
Date: 14th/12/2020
program that asks a user to enter an amount of money in Euros 
and the daily conversion rate and 
which then converts it to Sterling 
and displays the Sterling amount */


//import packages containing predefined classes
import java.util.*;

//class
public class ExchangeRate
{
   //method
   public static void main(String [] args)
   {
      //create instance of Scanner class
      Scanner keyboardIn = new Scanner(System.in);
      
      //variables
      double euroValue, conversionRate, sterlingValue;
      
      //Assign value from keyboard
      System.out.print("Enter the value in Euros");
      //read in double
      euroValue = keyboardIn.nextDouble();
      
      //Assign value from keyboard
      System.out.print("Enter the current conversion sterling rate");
      //read in double
      conversionRate = keyboardIn.nextDouble();
      
      //multiply the assigned from keyboard
      sterlingValue = euroValue * conversionRate;
      //output of the result
      System.out.print(euroValue + " Euros" + " is \n" + sterlingValue + " Sterling" );
      
   }//end main method
}//end class
