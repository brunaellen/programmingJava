/*Practical 3A - Question 5
Author : Bruna Ellen Gurgel Souza
Date: 30th/12/2020
Program that the price of a computer is 550 euro.  
If an order of 30 or more is placed the computers will cost 500 euro each.  
Write a program to ask the user how many computers they want to buy.  
The program should then calculate and display the total cost of the order.
	(total cost = quantity * price)
*/


//import packages cointaing predefined class (Scanner)
import java.util.*;

//main class
public class ComputerPrice 
{  //main method
   public static void main(String [] args)
   {  //create a instance of Scanner class
      
      
      final double computerPrice = 550D;
      final double computerDiscountPrice  = 50D;
      int quantity = askQuantity();    
        
      double totalCost = 0D;
      
      final int minimumQuantityForDiscount = 30;

      if (quantity >= minimumQuantityForDiscount) 
      {
         totalCost = quantity * (computerPrice - computerDiscountPrice);
         System.out.print("The total cost with 50 euro in discount of each computer is: " + totalCost);
      } 
      else
      {
         totalCost = quantity * computerPrice;
         System.out.print ("The total cost is: " + totalCost);
      }
          
   }  
   
   public static int askQuantity() {
      Scanner keyboardIn = new Scanner(System.in);
            
      while(true) {
         try {
            System.out.print("Enter the quantity of computer: ");
            String userInput = keyboardIn.next();
            int quantity = Integer.parseInt(userInput);
            if(quantity < 0) {
               throw new RuntimeException();
            } 
            
            return quantity;
         } catch(NumberFormatException e) {
            System.out.print("Invalid value!\n");
            e.printStackTrace();
         } catch (RuntimeException e) {
            System.out.println("The number must be positive.\n");
         }
      }
   }
}