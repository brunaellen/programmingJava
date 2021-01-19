/*Practical 3A - Question 4
Author : Bruna Ellen Gurgel Souza
Date: 30th/12/2020
Program that will read in the price of 3 different books from the user 
and will calculate and display the total amount owing.
If the total price is greater than 50.00 a 10% discount will be given. */

import java.util.Scanner;

public class BookPrice
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      double price1, price2, price3;
      
      System.out.print("Insert the price for the first book: ");
      price1 = keyboardIn.nextDouble();
      
      System.out.print("Insert the price for the second book: ");
      price2 = keyboardIn.nextDouble();
      
      System.out.print("Insert the price for the third book: ");
      price3 = keyboardIn.nextDouble();
      
      double totalPrice = price1 + price2 + price3;
      double valueWithDiscount = totalPrice * 0.90;
      
      if (totalPrice > 50)
      {
         System.out.print("You received a 10% discount! the total price was " + 
         totalPrice + " and now is only: " + valueWithDiscount);
      }
      
      else 
      {
         System.out.print("The total price is " + totalPrice); 
      }
   }
}