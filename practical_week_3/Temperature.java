/*Practical 3C - Question 2
Author : Bruna Ellen Gurgel Souza
Program to determine weather 
*/

import java.util.*;


public class Temperature
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //declare variable
      int temp;
      //ask user to enter the temperature
      System.out.print("Enter current temperature: ");
      temp = keyboardIn.nextInt();
      
      if(temp < 0)
      {
         System.out.print("freezing");
      }
      else if(temp >= 0 && temp <=6)
      {
         System.out.print("very cold");
      }
      else if(temp >=7 && temp <=14)
      {
         System.out.print("warm");
      }
      else if(temp >= 15 && temp <=21)
      {
         System.out.print("hot");
      }
      else
      {
         System.out.print("very hot");
      }
      
   }//close the main method
}//close the main class