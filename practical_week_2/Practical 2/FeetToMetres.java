/*Practical 2 - Question 4
Author: Clare Doherty
Date: 
Program to convert the measurement of feet into metres */

import java.util.*;
public class FeetToMetres
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Declare variables
      double feet, metres;
      //Assign values to variables
      //Get user input
      System.out.print("Enter the measurement in feet:");
      feet = keyboardIn.nextDouble();
      //Calculate metres
      metres = feet * 0.305;
      //Display result
      System.out.print(feet + " feet is equivalent to "+metres+ " metres");
   }
}
      
