/* rockpaperscissors.java */
/*
Author: One of you
Due Date:
*/
/*
This program asks the user for a number between 0-2 that represents rock, paper and scissors.
Then it randomly generates a number between 0-2 that represents the same to play against the users input.

Input:
number - Number between 0 and 2
*/


import java.util.Scanner;

public class Rockpaperscissors
{
	public static void main(String[] args)
	{
      int number;
      Scanner keyboard = new Scanner(System.in);
      System.out.print("scissor (0), rock (1), paper (2): ");
   	  number = keyboard.nextInt();

      //Generate random number
      int computernumber = (int)(Math.random() * 3);

      //Decide if number is between 0 and 2
      if (number < 0 || number > 2)
      {
       System.out.println("Error. The number you chose is invalid. Terminating the program");
       System.exit(0);
      }

      //Decide game outcome
      if (computernumber == number)
       System.out.print("You both picked the same. It is a draw. ");
      else if (computernumber == 0 && number == 1)
       System.out.print("The computer is scissors. You are rock. You win. ");
      else if (computernumber == 0 && number == 2)
       System.out.print("The computer is scissors. You are paper. You lose. ");
      else if (computernumber == 1 && number == 0)
       System.out.print("The computer is rock. You are scissors. You lose. ");
      else if (computernumber == 1 && number == 2)
       System.out.print("The computer is rock. You are paper. You win. ");
      else if (computernumber == 2 && number == 0)
       System.out.print("The computer is paper. You are scissors. You win. ");
      else if (computernumber == 2 && number == 1)
       System.out.print("The computer is paper. You are rock. You lose. ");
      System.out.println(); //go to the next line
	}//end of main
}//end of class