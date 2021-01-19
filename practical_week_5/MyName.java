/*question 5A - 1
Write a program to display your name 10 times to screen*/

import java.util.Scanner;

public class MyName
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      String name = "Bruna Souza";
      for(int count = 1; count <=10; count++)
      {
         System.out.println(count + name);
      }
   }
}