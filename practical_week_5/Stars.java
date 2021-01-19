/* question 5A - 3   
Write a program that uses a for loop to print 15 stars on screen as follows:
*/

import java.util.Scanner;

public class Stars
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      char star = '*';
      
      for(int count = 1; count <=15; count++)
      {
         System.out.println(count + star);
      }
   }
}