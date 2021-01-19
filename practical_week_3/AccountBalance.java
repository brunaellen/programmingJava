/*Practical 3B - Question 4
Author : Bruna Ellen Gurgel Souza
Date: 04/01/21
program that requests a user to enter their account balance.
If the balance is less than zero display a message 
stating ther account is overdrawn 
otherwise display a message stating the account is in credit
*/


//import package predefined of Scanner class
import java.util.Scanner;

//main class
public class AccountBalance
{  //main method
   public static void main (String [] args)
   {  //create an instance of Scanner class
      Scanner keyboardIn = new Scanner(System.in);
      
      double accountBalance, amountToWithdraw;
      
      //insert a input from keyboard
      System.out.print("Enter your Account balance: ");
      accountBalance = keyboardIn.nextDouble();
      
      System.out.print("insert the amount you want to withdraw cash : ");
      amountToWithdraw = keyboardIn.nextDouble();
      
      if (accountBalance < amountToWithdraw)
      {
         System.out.print("The account is overdrawn");
      }
      else
      {
         System.out.print("The account is in credit");
      } 
   }
}