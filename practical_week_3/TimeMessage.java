/*Practical 3C - Question 4
Author : Bruna Ellen Gurgel Souza
Date: 04/01/21
program that will allow a user to enter the time (in hours) 
and display the appropriate message

Time (In hours)	Message
0 – 11	         Good morning
12 – 17	         Good afternoon
18 – 23	         Good night
Any other time	Time is out of range
*/



import java.util.*;

public class TimeMessage
{
   public static void main (String [] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      int time;
      int minimumMorningTime = 0;
      int maximumMorningTime = 11;
      int minimumAfternoonTime = 12;
      int maximumAfternoonTime = 17;
      int minimumNightTime = 18;
      int maximumNightTime = 23;
      
      System.out.print("Insert the current time: ");
      time = keyboardIn.nextInt();
      
      if (time >= minimumMorningTime && time <= maximumMorningTime)
      {
         System.out.print("Good morning");
      }
      else if (time >= minimumAfternoonTime && time<= maximumAfternoonTime)
      {
         System.out.print("Good afternoon");
      }
      else if (time >= minimumNightTime && time<= maximumNightTime)
      {
         System.out.print("Good night");
      }
      else 
      {
         System.out.print("Time is out of range");
      }
   }
}