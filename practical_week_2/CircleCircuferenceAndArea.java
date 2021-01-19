/* Practical 2 - Question 9
Author: Bruna Ellen Gurgel Souza
Date: 19th/12/2020
Write a program that will ask a user to enter the diameter of a circle and 
which will then compute and display the area and circumference of the circle. 
Use a constant value of 3.14 for pi
radius = diameter / 2 circumference = 2 * pi * radius area = pi * radius * radius
 */
 
 import java.util.*;
 
 public class CircleCircuferenceAndArea
 {
   public static void main (String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double radius, area, circuference;
      final double pi = 3.14;
      double diameter;
      
      
      System.out.println("Insert the diameter of the circle ");
      diameter = keyboardIn.nextDouble();
      
      radius = diameter/2;
      
      circuference = 2 * pi * radius;
      
      area = pi * radius * radius;
      
      System.out.println("The circuference is " + circuference + " and the area is " + area);
      
   }
}