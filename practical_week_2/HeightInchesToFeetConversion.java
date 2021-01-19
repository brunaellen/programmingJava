/* Practical 2 - Question 8
Author: Bruna Ellen Gurgel Souza
Date: 19th/12/2020

Write a program which will ask the user to enter their height in inches, 
and which will then calculate and display their height in feet and inches. 
Note that there are 12 inches in a foot.
(Hint: Use modulus operator %)
 */

import java.util.*;

public class HeightInchesToFeetConversion
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double heightInches, heightInFeet, valueInfeet;
      final int formulaHeightInches = 12;
      
      System.out.println("Insert your height in inches ");
      heightInches = keyboardIn.nextDouble();
      
      valueInfeet =  heightInches / formulaHeightInches;
      
      System.out.println(heightInches + " inches is\n " + valueInfeet + " in feet");      
   }
}