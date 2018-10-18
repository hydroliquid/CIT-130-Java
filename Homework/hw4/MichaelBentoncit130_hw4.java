/*
	Name: Michael Benton
    Class name: CIT 130
    Date Assigned: 9/10/2018
    Date Due: 9/20/2018
	Time taken: 90mins

    A program to calculate one degree type into the other two types.

	**I looked up the conversion for each degree and I corrected them to get **
	**the same answer as your example. Your example conversions are correct  **
	**but the equation to get those results did not match.                   **

	Psuedo code

	Constants -
	K, k - Kelvin characters
	C, c - Celsius characters
	F, f - Fahrenheit characters

    Input-
	degreeType - user input of c, k, or f
	tempC - Celsius integer input
	tempK - Kelvin integer input
	tempF - Fahrenheit integer input

    Ouput-
	tempK
	tempC
	tempF

	1. Start
	2. Ask user for degree type
	3. Check for Degree type
	4. Ask for degree temp
	5. Check if temp is within range
	6. Output results

*/

import java.util.*; // Get Scanner class

public class MichaelBentoncit130_hw4
{
	public static void main(String[] a)
	{
		// Initalize Scanner
		Scanner get = new Scanner(System.in);

		// Initalize Variables
		char degreeType = ' ';
		// Initalize Constants
		final char K = 'K';
		final char k = 'k';
		final char C = 'C';
		final char c = 'c';
		final char F = 'F';
		final char f = 'f';

		double tempK = 0.0;
		double tempC = 0.0;
		double tempF = 0.0;


		// Ask user for degree type
		System.out.print("Enter the degree conversion code: ");
		degreeType = get.nextLine().charAt(0);

		// Check for correct input
		if (degreeType == K || degreeType == C || degreeType == F ||
			degreeType == k || degreeType == c || degreeType == f)
		{

		}else
		{
			System.out.print("INVALID code");
			System.exit(1);
		}
		// Check for Degree type
		if(degreeType == K || degreeType == k)
		{
			// Ask for degree temp
			System.out.print("Enter the temperature calue in degrees "
							 + "Kelvin: ");
			tempK = get.nextDouble();

			// Check if temp is within range
			if(tempK >= -500.0 && tempK <= 500.0)
			{
				tempC = tempK - 273.15;
				tempC = (int)(tempC * 100) / 100.0;
				tempF = tempK * 9/5 - 459.67;
				tempF = (int)(tempF * 100) / 100.0;
			}else
			{
				System.out.print("INVALID value for temperature");
				System.exit(1);
			}
		}
		// Check for Degree type
		if(degreeType == F || degreeType == f)
		{
			// Ask for degree temp
			System.out.print("Enter the temperature calue in degrees "
							 + "Fahrenheit: ");
			tempF = get.nextDouble();

			// Check if temp is within range
			if(tempF >= -500.0 && tempF <= 500.0)
			{
				tempC = (tempF - 32) * 5/9;
				tempC = (int)(tempC * 100) / 100.0;
				tempK = (tempF + 459.67) * 5/9;
				tempK = (int)(tempK * 100) / 100.0;
			}else
			{
				System.out.print("INVALID value for temperature");
				System.exit(1);
			}
		}
		// Check for Degree type
		if(degreeType == C || degreeType == c)
		{
			// Ask for degree temp
			System.out.print("Enter the temperature calue in degrees "
							 + "Celsius: ");
			tempC = get.nextDouble();

			// Check if temp is within range
			if(tempC >= -500.0 && tempC <= 500.0)
			{
				tempK = tempC + 273.15;
				tempK = (int)(tempK * 100) / 100.0;
				tempF = tempC * 9/5 + 32;
				tempF = (int)(tempF * 100) / 100.0;
			}else
			{
				System.out.print("INVALID value for temperature");
				System.exit(1);
			}
		}

		// Output results
		if(degreeType == K || degreeType == k)
		{
			System.out.println("Temperature in degrees Celsius: "
							   + tempC + " Celsius");
			System.out.println("Temperature in degrees Fahrenheit: "
							   + tempF + " Fahrenheit");

		}
		if(degreeType == F || degreeType == f)
		{
			System.out.println("Temperature in degrees Celsius: "
							   + tempC + " Celsius");
			System.out.println("Temperature in degrees Kelvin: "
				   			   + tempK + " Kelvin");
		}
		if(degreeType == C || degreeType == c)
		{
			System.out.println("Temperature in degrees Kelvin: "
							   + tempK + " Kelvin");
			System.out.println("Temperature in degrees Fahrenheit: "
							   + tempF + " Fahrenheit");
		}
	}
}