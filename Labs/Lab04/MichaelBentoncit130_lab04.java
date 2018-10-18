/*
	Name: Michael Benton
	Class name: CIT 130
	Assaignment: Lab 4
	Date Assigned: 9/19/2018
	Date Due: 9/26/2018
	Time taken: 2hrs 30mins

*/

import java.util.*; // Get Scanner class

public class MichaelBentoncit130_lab04
{
	public static void main(String[] a)
	{
		// Initalize Scanner
		Scanner get = new Scanner(System.in);

		/*
		//Part 1)
		int low = 5;
		int high = 15;
		int randNum = 0;

		randNum = (int)(Math.random()* high-low + 1) + low;

		System.out.println("Your generated random number is " + randNum);

		switch(randNum)
		{
			case 5:
			case 6:
				System.out.println("GOOD");
				break;
			case 7:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
				System.out.println("EXCELLENT");
				break;
		}
		*/
		//Part 2
		double num = 0.0f;
		String userInput = " ";
		int numLength = 0;

		// ask user for any number
		System.out.print("Enter any decimal number: ");
		num = get.nextDouble();

		// Use round fundtion and show rounded number
		//num = Math.round(num);
		System.out.printf("Your rounded number is: %d", Math.round(num));


		// Display the natural logarithm of the number with
		// 5 digits after the decimal point.
		num = Math.log(num);
		System.out.printf("\nThe natural logarithm of the number is: " +
							"%2.5f", num);
		System.out.println(" ");
		get.nextLine();

		// Ask for a string
		System.out.print("Enter a String: ");
		userInput = get.nextLine();
		numLength = userInput.length();


		// If string is myjava display error and terminate
		// all other input is valid
		if(userInput.equals("myjava"))
		{
			System.out.println("Program terminating!");

		}
		// If string has less than 3 chars display error and terminate
		else if(numLength <=3)
		{
			System.out.println("Program terminating!");
		}
		// If string is valid display length and first 3 chars
		else
		{
			System.out.println("Length of the string: " +
								userInput.length());
			System.out.println("The first 3 characters of the string is: " +
								userInput.substring(0, 3));
			System.out.println("Upper case: " + userInput.toUpperCase());
			System.out.println("Loswer case: " + userInput.toLowerCase());
			System.out.println("First character: " + userInput.charAt(0));
			System.out.println("Last character: "
								+ userInput.charAt(--numLength));
		}







		// if Valid display string in upper, lower case and display first
		// and last chars



	}
}