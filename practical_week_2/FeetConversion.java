/* Practical 2 - Question 3
Author: Bruna Ellen Gurgel Souza
Date: 14th/12/2020
program that will ask a user to input a number in feet, 
convert it to metres and display the metres */

import java.util.*;

public class FeetConversion
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int feetNumber;
      final double METRESRATE = 0.305;
      double totalMetres;
      
      System.out.print("Enter the numbers of foot ");
      feetNumber = keyboardIn.nextInt();
      
      totalMetres = feetNumber * METRESRATE;
      System.out.print(feetNumber + " feet is " + totalMetres + " in metres");

   }
}