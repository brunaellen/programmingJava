/*Practical 2 - Question 6
Author: Clare Doherty
Date: 
Program to calculate a person age as a number of days */

import java.util.*;
public class AgeinDays
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Declare variables
      int age, ageinDays;
      //Assign values to variables
      //Get user input
      System.out.print("Enter your age:");
      age = keyboardIn.nextInt();
      //Calculate age in days
      ageinDays = age * 365;
      //Display age in days
      System.out.print(age + " years old in days is equal to "+ageinDays);
   }
}