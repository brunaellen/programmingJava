/*Practical 2 - Question 5
Author: Clare Doherty
Date:
Program to calculate a person's age*/

import java.util.*;
public class Age
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Declare variables
      int age, birthYear;
      String name;
      //Assign values to variables
      //Get user input
      System.out.print("Enter your name:");
      name = keyboardIn.nextLine();
      System.out.print("Enter year you were born:");
      birthYear = keyboardIn.nextInt();
      //Calculate age.  Note this age will only be correct in year 2020
      //Think about how you could change this to calculate person age for any year
      age = 2020 - birthYear;
      System.out.print(name + " you are "+age+ " years old");
   }
}
      