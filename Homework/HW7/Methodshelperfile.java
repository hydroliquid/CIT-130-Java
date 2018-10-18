/*

	Author:
	Due Date:

	This Program will have 5 methods that request
	and add	integers, doubles, multiply doubles,
	request	a first name and print it 5 times,
	request a last name and print it a number of
	times as defined by the user

	Input Variables:
		addOne		The first integer to be added
					as defined by the user

		addTwo		The second integer to be added
					as defined by the user

		addThree	The first double to be added
					as defined by the user

		addFour		The second double to be added
					as defined by the user

		multOne		The first double to be multiplied
					as defined by the user

		multTwo		The second double to be multiplied
					as defined by the user

		multThree	The third double to be multiplied
					as defined by the user

		priDef		The number of times the user wishes
					to have their last name printed

		fName		The user's first name

		lName		The user's last name

	Output Variables:
		totalOne	The total calculated by the first
					addition method

		totalTwo	The total calculated by the Second
					addition method

		totalThree	The total caculated by the product
					method


*/


// This imports the Scanner utility for user input later on.
import java.util.Scanner;

public class Methodshelperfile
{
	public static void main(String[] args)
	{
		// Here we state we want input as the variable name for the scanner class.
		Scanner input = new Scanner(System.in);

		//We delcare what we need here. Spaced out by the Methods they will be used in.
		int number1;
		int number2;

		double number3;
		double number4;

		double number5;
		double number6;
		double number7;

		String word1;

		int number8;
		String word2;

		System.out.println("Let's try some methods!");

		//CALL METHOD ONE - We do simple addition through calling a method.
		System.out.println("First give me two numbers to add, press enter after each number: ");
		number1 = input.nextInt();
		number2 = input.nextInt();

		//This is where we call the method and assign it to a new varible and then call that.
		int totalNumber = sum(number1, number2);
		System.out.println("The sum of your two numbers is: " + totalNumber);

		//CALL METHOD TWO - This is an overloaded allowing us to call double numbers with sum(x, y).
		System.out.println("Great! Now try giving me two decimal numbers or parts of a number to add, \npresss enter after each number: ");
		number3 = input.nextDouble();
		number4 = input.nextDouble();

		//This time we use double instead of int when assigning our method return to a variable.
		double totalDecimalNumber = sum(number3, number4);
		System.out.println("The sum of your two decimal numbers is: " + totalDecimalNumber);

		//CALL METHOD THREE - We do multiplication through methods and three numbers.
		System.out.println("Ok, now I want three decimal numbers, press enter after each number: ");
		number5 = input.nextDouble();
		number6 = input.nextDouble();
		number7 = input.nextDouble();

		//We call the method and assign the product to a new variable.
		double productDecimalNumber = product(number5, number6, number7);
		System.out.println("The product of your three numbers is: " + productDecimalNumber);

		//CALL METHOD FOUR - Method four uses String to display a name given by the user 5 times.
		System.out.print("Let's try something different, what is your name: ");
		input.nextLine();
		word1 = input.nextLine();
		name(word1);

		System.out.println("Haha! I just displayed your name 5 times!");

		//CALL METHOD FIVE - We take a String value and let the user determine how many times it's displayed.
		System.out.println("Give me your name again or any name and then a whole number: ");
		word2 = input.nextLine();
		number8 = input.nextInt();
		System.out.println(" ");
		name(word2, number8);

		//We display the users name and let them know how many times we displayed it.
		System.out.println("Now I displayed your name " + number8 + " times!");
	}//End Main

	//METHOD ONE - We simply add two intergers and return the sum.
	public static int sum(int num1, int num2)
	{

		int sum;
		sum = num1 + num2;

		return sum;
	}

	//METHOD TWO - We simple add two doubles and return the sum, using double as key word instead of int.
	public static double sum(double num1, double num2)
	{
		double sum;
		sum = num1 + num2;

		return sum;
	}

	//METHOD THREE - We multiply the three double numbers and return the product as a double.
	public static double product(double num1, double num2, double num3)
		{
			double product;
			product = num1 * num2 * num3;

			return product;
	}

	//METHOD FOUR - We use a for loop to set the conditions to cycle through and S.O.P the variable 5 times.
	public static void name(String fName)
	{
		for (int i = 1; i <= 5;i++)
		{
			System.out.println(fName);
		}
	}

	/*
		METHOD FIVE - This time we use a varible
		for the conditions that uses the interget
		the user entered instead of a constant
		number for cylcing through the loop.
	*/
	public static void name(String fName, int numTimes)
	{
		for (int i = 1; i <= numTimes;i++)
		{
			System.out.println(fName);
		}
	}
}//End Class Methodshelperfile