/*Practical 2 - Question 4
Author: Clare Doherty
Date: 
Program to enter price of 3 items and apply 10% discount*/

import java.util.*;
public class DiscountItems
{
   public static void main(String []args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Declare variables
      double price1, price2, price3, gross, totalPrice, discount;
      //Get prices from user
      System.out.print("Enter price of item 1: ");
      price1 = keyboardIn.nextDouble();
      System.out.print("Enter price of item 2: ");
      price2 = keyboardIn.nextDouble();
      System.out.print("Enter price of item 3: ");
      price3 = keyboardIn.nextDouble();
      //Calculate total and discount
      gross = price1 + price2 + price3;
      discount = gross * 0.10;
      totalPrice = gross - discount;
      //Display gross amount, discount and total due
      System.out.println("Gross amount of items is €"+ gross);
      System.out.println("Discount earned €"+ discount);
      System.out.println("Final price to pay €"+totalPrice);
   }
}
      