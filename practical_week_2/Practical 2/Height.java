/*Practical 2 - Question 8
Author: Clare Doherty
Date: 
Program to read person height in inches and convert it to feet and inches */

import java.util.*;
public class Height
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Declare variables
      int height, feet, inches;
      //Get height from user in inches
      System.out.print("Enter your height in inches:");
      height = keyboardIn.nextInt();
      //Convert height to feet and inches
      feet = height / 12;
      inches = height % 12;
      //Display height as feet and inches
      System.out.print(height+ " Inches is equivalent to "+feet+ " feet and "+inches+ " inches");
   }
}
