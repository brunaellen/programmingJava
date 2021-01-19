/* Practical 2 - Question 1
Author: Bruna Ellen Gurgel Souza
Date: 14th/12/2020
Program to add any 2 numbers */

//import packages containing predefined classes
import java.util.*;

//class
public class AddNumbers
{  
   //method
   public static void main(String [] args)
   {  
      //create instance of Scanner class
      Scanner keyboardIn = new Scanner(System.in);
      
      //declare variables
      int number1, number2, result;
      
      //Assign values from keyboard
      System.out.print("Please enter number 1:");
      //read in integer
      number1 = keyboardIn.nextInt();
      
      //Assign values from keyboard
      System.out.print("Please enter number 2:");
      //read in integer
      number2 = keyboardIn.nextInt();
      
      //add the numbers assigned from keyboard
      result = number1 + number2;
      //output the result
      System.out.print("The result of the 2 numbers added is " + result);
      
   }//end main method
}//end class


