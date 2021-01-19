/* Practical 2 - Question 4
Author: Bruna Ellen Gurgel Souza
Date: 14th/12/2020
program that will prompt the user to enter the price of three different products 
in a sale where a discount of 10% is applied. 
Display the gross amount of the 3 items, 
the discount earned, and the total amount due.
 */
 
import java.util.*;

public class ProductDiscount
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in); 
            
      double priceProduct1, priceProduct2, priceProduct3;
      
      System.out.println("insert the price of the first product" );
      priceProduct1 = keyboardIn.nextDouble();
      
      System.out.println("insert the price of the second product" );
      priceProduct2 = keyboardIn.nextDouble();
      
      System.out.println("insert the price of the third product" );
      priceProduct3 = keyboardIn.nextDouble();
      
      double grossAmount = priceProduct1 + priceProduct2 + priceProduct3;
      double discountRate = (0.10);
      double discount = grossAmount * discountRate;
      double amountDue = grossAmount - discount;
      
      System.out.println("Gross amount = " + grossAmount + " \t Discount = " + discount + "\t Amount Due = " + amountDue);
      
   }
}