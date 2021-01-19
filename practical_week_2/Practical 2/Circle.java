/*Practical 2 - Question 9
Author: Clare Doherty
Date: 
Program to calculate area and circumference of a circle
area is pi * radius * radius
circumference is 2 * pi * radius */

import java.util.*;
public class Circle
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Declare variables
      double diameter, radius, circumference, area;
      //Declare constant
      final double PI = 3.14;
      //Assign values to variables
      //Get user input
      System.out.print("Enter diameter of the circle: ");
      diameter = keyboardIn.nextDouble();
      //Calculate area and circumference - find radius first
      radius = diameter / 2;
      area = PI * radius * radius;
      circumference = 2 * PI * radius;
      //Display area and circumference
      System.out.print("Area of the circle is "+area+ " and it's circumference is "+circumference);
   }
}
