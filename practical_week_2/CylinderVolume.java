/* Practical 2 - Question 7
Author: Bruna Ellen Gurgel Souza
Date: 19th/12/2020
Write a program that asks a user to enter the radius and 
the height of a cylinder and 
which then computes and displays the volume of the cylinder.
volume = pi * radius * radius * height. Use a constant value of 3.14 for pi.
 */
 
 import java.util.*;
 
 public class CylinderVolume
 {
   public static void main (String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double radius, height, volume;
      final double PI = 3.14;
      double diameter;
      
      System.out.println("Insert the radius of the cylinder ");
      radius = keyboardIn.nextDouble();
      
      System.out.println("Insert the height of the cylinder ");
      height = keyboardIn.nextDouble();
      
      diameter = 2 * radius;
      
      volume = PI * diameter * height;
      
      System.out.println(volume);
      
   }
 }