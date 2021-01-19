/*Practical 3A - Question 1
Author : Bruna Ellen Gurgel Souza
Date: 21st/12/2020
Program to determine BankBalance 
*/

//import packages containing predefined class Scanner
import java.util.Scanner;

//main class
public class BankBalance
{  //main method
   public static void main(String [] args)
   {  //create instance of Scanner class
      Scanner keyboardIn = new Scanner(System.in);
      // declare variable
      double bankBalance = 0;
      // assign values from the keyboard
      System.out.print("Please enter your bank balance: ");
      //read the variable bankBalance from the keyboard
      bankBalance = keyboardIn.nextDouble();
      //condition
      if(bankBalance > 0)
      {  //statement
         System.out.println("you are in credit");
      }
   } //end main method
} //end class