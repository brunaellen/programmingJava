/*Practical 3B - Question 1
Author : Bruna Ellen Gurgel Souza
Date: 04/01/21
Program to determine free admission to a person under the age of 12
*/

//import package containig predefined java class (Scanner)
import java.util.Scanner;

//main class
public class Age 
{  //main method
   public static void main (Straing [] args)
   {  //create a instance of Scanner class 
      Scanner keyboarIn = new Scanner(System.in);
      
      //variable. The type is integer
      int age;
      
      //insert a input from keyboard
      System.out.print("Enter your age: ");
      age = keyboard.nextInt();
      
      //condition
      if (age < 12)
      {  //statement
         System.out.println("Admission is free");
      }
      //condition
      else
      {  //statement
         System.out.println("Charge is €10");
         
      }//end of condition
   }//end of main method
}//end of main class