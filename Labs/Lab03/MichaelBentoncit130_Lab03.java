/*
    Name: Michael Benton
    Class name: CIT 130
    Date Assigned: 9/12/2018
    Date Due: 9/12/2018

    Part1) This program takes the integer value for cents and converts it into
    half dollars, quarters, dimes, nickels, and pennies

    input-
	name - user name
	cents - amount of money in cents
	halfDollars - number of half dollars
	quarters - number of quarters
	dimes - number of dimes
	nickels - number of nickels
	pennies - number of pennies
	temp - temporay veriable to hold mod number

	output -
	name - user name
	cents - amount of money in cents
	halfDollars - number of half dollars
	quarters - number of quarters
	dimes - number of dimes
	nickels - number of nickels
	pennies - number of pennies

		Part2) A program tha calculates the shipping cost based on weight.

		Constants -
		LESS_2LBS - less than 2 pounds
		BETWEEN_2_10LBS - between 2 and 10 pounds
		BETWEEN_10_25LBS - between 10 and 25 pounds
		OVER_25LBS - over 25 pounds

	    input-
	    weight - weight of the box

		output -
		weight -
		shipCost - cost of shipping

    * Time taken to complete this program: 90mins
*/

import java.util.*;  //Scanner class

public class MichaelBentoncit130_Lab03
{
    public static void main(String[] args)
    {
		// initalize Scanner
	    Scanner get = new Scanner(System.in);

		// Part 1)
	    //declare variables
	    String name;
		int cents = 0;
		int halfDollars = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		int temp = 0;

		// Ask user for name and cents
		System.out.print("Enter your name: ");
		name = get.nextLine();

		System.out.print("Enter an amount in cents: ");
		cents = get.nextInt();

		//calculate cents
		if (cents >= 50)
		{
			halfDollars = cents / 50;
			temp = cents % 50;
		}//50
		if (temp >= 25)
		{
			quarters = temp / 25;
			temp = temp % 25;
		}//25
		if (temp >= 10)
		{
			dimes = temp / 10;
			temp = temp % 10;
		}//10
		if (temp >= 5)
		{
			nickels = temp / 5;
			temp = temp % 5;
		}//5
		if (temp >= 1 )
		{
			pennies = temp / 1;

		}//1

		// Output results

		System.out.println("Your name is " + name);

		if (halfDollars > 0)
		{
			System.out.println("Number of half-dollars = " + halfDollars);
		}
		if (quarters > 0)
		{
			System.out.println("Number of quarters = " + quarters);
		}
		if (dimes > 0)
		{
			System.out.println("Number of dimes = " + dimes);
		}
		if (nickels > 0)
		{
			System.out.println("Number of nickels = " + nickels);
		}
		if (pennies > 0)
		{
			System.out.println("Number of pennies = " + pennies);
		}



		//Part 2)

		// Initalize Constants
		final double LESS_2LBS = 0.75;
		final double BETWEEN_2_10LBS = 1.12;
		final double BETWEEN_10_25LBS = 1.87;
		final double OVER_25LBS = 50.00;
		// Initulize Variables
		double weight = 0.0;
		double shipCost = 0.0;

		// ask for package weight
		System.out.print("Enter the package weight in lbs: ");
		weight = get.nextDouble();

		// Calulate shipping cost
		if (weight <= 0)
		{
			System.out.println("ERROR: Cannot process this data.");
			System.exit(1);
		}else if(weight > 0)
		{
			if(weight >= 0.1 && weight < 2.0)
			{
				shipCost = weight * LESS_2LBS;

			}
			else if(weight >= 2.0 && weight < 10.0)
			{
				shipCost = weight * BETWEEN_2_10LBS;

			}
			else if(weight >= 10.0 && weight < 25.0)
			{
				shipCost = weight * BETWEEN_10_25LBS;

			}
			else
			{
				shipCost = 50.0;

			}
		}
		// Modify shipping cot into dollars and cents
		shipCost = (int)(shipCost * 100) / 100.0;

		//Display output
		System.out.println("The shipping cost for a package weighing "
						   + weight + "lbs is " + "$" + shipCost);

	}//main
}//class