/*Week 4 - Practical4B -Question 1
Write a program that will repeatedly 
let a user enter any number until they enter the number 0.

*/

import java.util.*;

public class EnterNumber12121
{
   public static void main(String []args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      

      int number =20;

      do
      {
         System.out.print(number + " ");
         number++;
      
      } while(number >= 30);
   }     
} 