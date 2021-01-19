/*Practical 2 - Question 7
Author: Clare Doherty
Date: 
Program to calculate volume of a cylinder
Formula = pi * radius * radius * height */

import java.util.*;
public class Cylinder
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Declare variables
      double radius, height, volume;
      //Declare constant
      final double PI = 3.14;
      //Assign values to variables
      //Get user input
      System.out.print("Enter radius of the cylinder: ");
      radius = keyboardIn.nextDouble();
      System.out.print("Enter height of the cylinder: ");
      height = keyboardIn.nextDouble();
      //Calculate volume
      volume = PI * radius * radius * height;
      //Display cylinder volume
      System.out.print("Volume of the cylinder is "+volume);
   }
}
