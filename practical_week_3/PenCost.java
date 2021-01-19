/*Practical 3B - Question 5
Author : Bruna Ellen Gurgel Souza
Date: 04/01/21
Write a program to calculate the cost of buying pens depending 
on the quantity entered.  
If an order of 30 or more is placed the pens will cost 20 cents each 
otherwise the pens will cost 50 cents each
cost = quantity * price
*/

//import package predefined of Scanner class
import java.util.Scanner;

//main class
public class PenCost
{  //main method
   public static void main (String [] args)
   {  //create an instance of Scanner class
      Scanner keyboardIn = new Scanner(System.in);

      int quantityOrdered;
      double totalCost;
      double price = 0.50;
      double discountValue = 0.30;
      int minimumQuantityForDiscount = 30;
      
      //insert a input from keyboard
      System.out.print("Enter the quantity of pens you want to order: ");
      quantityOrdered = keyboardIn.nextInt();
      
      //coindition
      if (quantityOrdered >= minimumQuantityForDiscount)
      {  //statement
         totalCost = quantityOrdered * (price - discountValue);
         System.out.print("The total cost with a discount of 60% is " + totalCost);
      }
      else 
      {  //statement
         totalCost = quantityOrdered * price;
         System.out.print("The total cost is " + totalCost);
         
      }//end of condition
   }//end of main method
}//end of main class