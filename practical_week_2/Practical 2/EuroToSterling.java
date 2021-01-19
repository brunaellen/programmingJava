/*Practical 2 - Question 3
Author: Clare Doherty
Date: 
Program to convert amount of money in Euros to sterling */

import java.util.*;
public class EuroToSterling
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Declare variables
      double euros, sterling, convRate;
      //Assign values to variables
      //Get user input
      System.out.print("How much Euros do you wish to convert to Sterling:");
      euros = keyboardIn.nextDouble();
      System.out.print("Enter today's exchange rate:");
      convRate = keyboardIn.nextDouble();
      //Calculate Sterling amount
      sterling = euros * convRate;
      System.out.print("€ "+euros+ " is worth £ "+sterling);
   }
}