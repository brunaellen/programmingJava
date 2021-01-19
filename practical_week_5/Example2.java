/*practical 5 
18/01/21*/

import java.util.Scanner;

public class Example2
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      int number, total = 0;
      for(int count = 1; count <=5; count++)
      {
         System.out.print("Enter number "+count);
         number = keyboardIn.nextInt();
         total = number + total;
      }
   }
}