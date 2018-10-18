/*
	Name: Michael Benton
	Class name: CIT 130
	Assaignment: hw7
	Date Assigned: 10/01/2018
	Date Due: 10/11/2018
	Time taken:  3 Hrs mins

	Psuedo code

    Input-
    choice - Menu variable to determine method option
	num- number to factorial
	factNum- result of factorial
	word- string to use for count method
	focus - character to look for in string
	principal- starting bank
	rate- annual percetage rate
	times- times per year to be compounded
	years- number of year to calculate for
	endBal- result of compounded intrest

	Start
	Display menu
	1. Find factorial
	2. Find number of occurrence
	3. Find Future value
	4. End the program
	Get choice
	if Choice == 1
	Get number to factorial
	use Factorial method
	check if num < 10
	start loop to calculate Factorial
	return num
	display factorial
	if choice == 2
	get string
	get character
	use count method
	start loop to count char in string
	return count
	display count
	if choice == 3
	get pricipal
	get rate
	get times per year
	get years
	use getFutureValue method
	calculate endBal
	return endBal
	display endBal
	if choice == 4
	output "Thanks for using my program"


*/
import java.util.*; // Scanner

public class MichaelBentoncit130_hw7
{
	public static void main(String[] a)
	{
		// Initialize Variables
		Scanner get = new Scanner(System.in);
		// Menu Vars
		int choice = 0;
		// Factorial Vars
		int num = 0; // Used in count method and Factorial Method
		int factNum = 0;
		// count Vars
		String word = " ";
		char focus = ' ';
		// getFutureValue Vars
		double principal = 0.0;
		double rate = 0.0;
		int times = 0;
		int years = 0;
		double endBal = 0.0;

		// Method 1 - MenuDisplay
		MenuDisplay();
		choice = get.nextInt();
		// Loop to allow for user control
		while(choice != 0)
		{
			// Method 2 - Factorial
			if(choice == 1)
			{
				// Get input
				System.out.print("Enter the number you want the "
						+ "factorial of: ");
				num = get.nextInt();
				// Call method and store
				factNum = Factorial(num);
				// Display Output
				System.out.println("Factorial of " + num + " is "
							+ factNum);
				// Display Menu
				MenuDisplay();
				choice = get.nextInt();
			}
			// Method 3 - Count
			else if(choice == 2)
			{
				get.nextLine(); // clear buffer
				// Get input
				System.out.print("Enter a string: ");
				word = get.nextLine();
				System.out.print("Enter a character to consider: ");
				focus = get.nextLine().charAt(0);
				// Call method and store
				num = count(word, focus);
				// Display Output
				System.out.println("The letter "+focus+" was found in hello, "
							+ num +" time(s)");
				// Display Menu
				MenuDisplay();
				choice = get.nextInt();
			}
			// Method 4 - getFutureValue
			else if(choice == 3)
			{
				// Get input
				System.out.print("Enter the original balance: ");
				principal = get.nextDouble();
				System.out.print("Enter the annual interest rate: ");
				rate = get.nextDouble();
				System.out.print("Enter the number of times per year that "
							+"the interest is compounded: ");
				times = get.nextInt();
				System.out.print("Enter the number of years for the "
							+ "account to earn interest: ");
				years = get.nextInt();
				// Call method and store
				endBal = getFutureValue(principal, rate, times, years);
				// Display Output
				System.out.printf("The future balance is: $%2.2f", endBal);
				System.out.println("");
				// Display Menu
				MenuDisplay();
				choice = get.nextInt();
			}
			else
			{
				// Display output
				System.out.print("Thanks for using my program");
				// Make sure any value other than 1-4 returns 0 to prevent
				// infinate loop.
				choice = 0;
			}
		}// end loop
	}// end main
	// Name: MenuDisplay
	// return: void
	// Parameter(s): NA
	//
	public static void MenuDisplay()
	{
		System.out.print("1. Find factorial \n"
						+ "2. Find number of occurrence \n"
						+ "3. Find future value \n"
						+ "4. End the program \n");
	}// end Menu
	// Name: Factorial
	// return: factorial
	// Parameter(s): int num
	public static int Factorial(int num)
	{
		int factorial = 1;

		if(num < 10)
		{
			for (int i = 1; i <= num; i++)
			{
				factorial *= i;
			}
		}
		else
		{
			System.out.println("Factorial of your number cannot "
							+ "be calculated");
			factorial = -1;
		}


		return factorial;
	}// end Factorial
	// Name: count
	// return: count
	// Parameter(s): String str
	// char c
	public static int count(String str, char c)
	{
		int count = 0;

		for(int i = 0; i < str.length(); i++)
		{
			if(c == str.charAt(i))
			{
				count += 1;
			}
		}
		return count;
	}// End count
	// Name: getFurtureValue
	// return: endBal
	// Parameter(s): double principal, double rate,
	// int times, int years
	public static double getFutureValue(double principal, double rate,
									int times, int years)
	{
		double endBal = 0.0;
		rate = rate / 100.0;
		endBal = principal * Math.pow(( 1 + rate / times),(times * years));

		return endBal;
	}// end getFutureValue
}