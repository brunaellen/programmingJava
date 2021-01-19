/*Week 4 - Practical4A -Question4
Write a program, using a while loop, 
that will display 35 stars (*) on screen.

 */

public class Stars35
{
   public static void main(String []args)
   {
      //declare counter variable
      char character = '*';
      int counter = 1;
      
      while (counter <= 35)
      {
         System.out.println(counter + " " + character);
         counter++;
         
      }//end of loop
   }//end of main method
}//end of main class