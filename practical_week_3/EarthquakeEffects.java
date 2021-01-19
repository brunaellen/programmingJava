/*Practical 3C - Question 3
Author : Bruna Ellen Gurgel Souza
Date: 04/01/21
Write a program that will display the effects of an earthquake based on 
the Richter scale values shown below. 
The program should read the Richter scale value from the user and 
display the appropriate effects:

RICHTER SCALE VALUE	EFFECT
Less than 4	         Little
4.0-4.9	            Windows shake
5.0-5.9	            Walls crack; poor built buildings are destroyed
6.0-6.9	            Chimneys tumble, some buildings are destroyed
7.0-7.9	            Well build buildings are damaged
More than 7.9	      Most buildings are destroyed
*/

import java.util.Scanner;

public class EarthquakeEffects
{
   public static void main (String [] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      double richterScaleValue;
      
      System.out.print("Insert the Richter scale value: ");
      richterScaleValue = keyboardIn.nextDouble();
      
      if (richterScaleValue < 4)
      {
         System.out.print("Effects: Little ");
      }
      else if (richterScaleValue >= 4.0 && richterScaleValue <= 4.9)
      {
         System.out.print("Effects: Windows shake ");
      }
      else if (richterScaleValue >= 5.0 && richterScaleValue <= 5.9)
      {
         System.out.print("Effects: Walls crack; poor built buildings are destroyed ");
      }
      else if (richterScaleValue >= 6.0 && richterScaleValue <= 6.9)
      {
         System.out.print("Effects: Chimneys tumble, some buildings are destroyed ");
      }
      else if (richterScaleValue >= 7.0 && richterScaleValue <= 7.9)
      {
         System.out.print("Well build buildings are damaged ");
      }
      else
      {
         System.out.print("Most buildings are destroyed ");
      }
   }
}