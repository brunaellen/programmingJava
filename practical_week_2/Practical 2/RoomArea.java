/*Practical 2 - Question 10
Author: Clare Doherty
Date: 
Program to calculate area of a room and cost of flooring it */

import java.util.*;
public class RoomArea
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Declare variables
      double length, width, area, floorCost;
      //Assign values to variables
      //Get user input
      System.out.print("Enter length of the room in metres:");
      length = keyboardIn.nextDouble();
      System.out.print("Enter width of the room in metres:");
      width = keyboardIn.nextDouble();
      //Calculate area and cost of flooring
      area = length * width;
      floorCost = area * 6.50;
      //Display area and floor cost
      System.out.print(length + " by "+width+ " room is "+area+ " square metres and will cost €"+ floorCost+ " to floor it");
   }
}