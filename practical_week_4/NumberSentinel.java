//continue entering a positive number
import java.util.*;
public class NumberSentinel {
   public static void main(String args[])
   {
      Scanner keyboardIn = new Scanner(System.in);
      //declare variable
      int number;
      do
      {
      System.out.print("Enter a positive number - neg number will exit the loop:");
      number = keyboardIn.nextInt();
      } while (number >= 0);//continue repeating if user enters positive num 
      System.out.print(number + " terminated the loop");
   } //end main
} //end class