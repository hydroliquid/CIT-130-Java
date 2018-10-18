/* Roulette.java  */
/*

   Author:
   Due Date :
   Completion Time :

*/

/* Program Details:

   This program emulates a roulette wheel that has numbers 0 - 36 and each number has a colored pocket of either black, red or green.
   The user enters a number from 0 - 36 and finds out what color corresponds to their chosen pocket.

   Input variables:
   choice - the number chosen by the user.

   Output variables:
   choice - the number chosen by the user used for print statement.
*/


/******************
 *START OF PROGRAM*
 ******************/

import java.util.Scanner;	//Imports the scanner utility from the java.util package

public class Roulette{
    public static void main (String[] args){

    //Creates the scanner utility for user input
    Scanner input = new Scanner (System.in);

    //Prompts the user to enter a number
    System.out.print("Enter a number between 0-36 : ");
    int choice = input.nextInt();	//User is input is assigned to variable choice


    // Failsafe to ensure the user input is a valid entry
    if (choice < 0 || choice > 36){
		System.out.println("Invalid number!! Out of range!!");
    }

   //Compares the user entry and displays the color of the corresponding pocket
    else if (choice >= 1 && choice <= 10 || choice >= 19 && choice <= 28){    //The user entry is compared to 2 sets of ranged numbers of 1-10 and 19-28
		if (choice % 2 == 0){	//Checks if user choice is even or odd
		 System.out.println("Number " + choice + " - Black");	//If user entry is even pocket is black
		}
		else{
		 System.out.println("Number " + choice + " - Red");	//If user entry is odd pocket is red
	    }
	}

    //Compares the user entry and displays the color of the corresponding pocket
	else if (choice >= 11 && choice <= 18 || choice >= 29 && choice <= 36){    //The user entry is compared to 2 sets of ranged numbers of 11-18 and 29-36
			if (choice % 2 == 0){	//Checks if user choice is even or odd
			 System.out.println("Number " + choice + " - Red");    //If user entry is even pocket is red
			}
			else{
		     System.out.println("Number " + choice + " - Black");    //If user entry is odd pocket is black
		    }
	}

    //If number is zero then following statement is used
	else{
		System.out.println("Number " + choice + " - Green");    //If user entry is zero then pocket color is green
	}


    }    //Ends main
}    //Ends class
