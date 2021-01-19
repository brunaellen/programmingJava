/*Practical 3A - Question 3
Author : Bruna Ellen Gurgel Souza
Date: 30th/12/2020
Program that will read a number from the user and
will determine if the number is greater than 100.  
If the number is greater than 100 the program should display an appropriate message 
on screen.*/


//import package containig predefined class scanner
import java.util.Scanner;

//main class
public class Greater100
{  //main method
   public static void main(String [] args)
   {  //create an instance of the Scanner class
      Scanner keyboardIn = new Scanner(System.in);
      
      //variable
      double number;
      
      //assign value from the keyboard
      System.out.print("Insert the number: ");
      //read variable from the keyboard
      number = keyboardIn.nextInt();
      
      if (number > 100)
      {
         System.out. print("The number " + number + " is greater than 100!");
      }
      else
      {
         System.out.print(" The number " + number + " is less than 100!");
      }
   }  
}