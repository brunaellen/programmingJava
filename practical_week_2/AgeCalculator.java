/* Practical 2 - Question 5
Author: Bruna Ellen Gurgel Souza
Date: 14th/12/2020
Write a program that will ask a user to enter their name and the year they were born. 
The program should then calculate their age 
and display this along with the person’s age
age = 2020 – year born
 */
 
 
 import java.util.*;
 
 public class AgeCalculator
 {
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int age;
      String firstName, surname;
      int currentYear;
      int yearBorn;
      
      
      System.out.println("Insert your first name ");
      firstName = keyboardIn.nextLine();
      
      System.out.println("Insert your surname name ");
      surname = keyboardIn.nextLine();
      
      System.out.println("Insert the year you were born ");
      yearBorn = keyboardIn.nextInt();
      
      System.out.println("Insert the current year ");
      currentYear = keyboardIn.nextInt();
      
      age = currentYear - yearBorn;
      
      System.out.println(age + " = " + currentYear + " - " + yearBorn);
      
      //String formula = "%s = %s - %s";
      
      //System.out.println(String.format(formula, age, currentYear, yearBorn));
   }
 }
 
