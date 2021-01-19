/* Practical 2 - Question 10
Author: Bruna Ellen Gurgel Souza
Date: 19th/12/2020
Write a program that will ask a user to input the length and width of a room in metres; 
calculate the square metres of the room and 
calculate how much it will cost to floor the room if flooring costs €6.50 per square metre
area = length * width
 */
 
 import java.util.*;
 
 public class RoomCostAndArea
 {
   public static void main (String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double length, width, area, totalCost;
      double costRate = 6.50;
      
      System.out.println(" insert the room length ");
      length = keyboardIn.nextDouble();
      
      System.out.println(" insert the room width ");
      width = keyboardIn.nextDouble();
      
      area = length * width;
      
      totalCost = area * costRate;
      
      System.out.println(area + " square metres will cost " + totalCost);
   }
}