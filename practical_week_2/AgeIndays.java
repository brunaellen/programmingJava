/* Practical 2 - Question 6
Author: Bruna Ellen Gurgel Souza
Date: 14th/12/2020
Write a program that will ask a user to enter their age in years and 
which will compute and display that age as a number of days. 
Assume each year has 365 days.
days = age * 365
 */
 
 import java.util.*;
 
 public class AgeIndays
 {
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int age, ageInDays;
      final int aYear = 365;
      
      System.out.println(" insert your age ");
      age = keyboardIn.nextInt();
      
      ageInDays = age * aYear;
      
      System.out.println(ageInDays + " days ");
   }
 }