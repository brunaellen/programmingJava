/* week 2
Author: Bruna Ellen Gurgel Souza
Date: 14th/12/2020
Program to calculate cost of cinema tickets */

import java.util.*;

public class CinemaCost
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      int numberOfTickets;
      double price, total;
      price = 15.50;
      
      System.out.print("Enter the number of tickets");
      numberOfTickets = keyboardIn.nextInt();
      
      total = price * numberOfTickets;
      System.out.print("The cost of " + numberOfTickets + " tickets is " + total);

   }
}