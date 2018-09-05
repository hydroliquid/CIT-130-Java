import java.util.Scanner;

public class Ch2Notes
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); //prompt the user for input
		System.out.print("Enter an integer for seconds: ");
		int seconds = input.nextInt();

		int minutes = seconds / 60; // Find minutes in seconds
		int remainingSeconds = seconds % 60; // Seconds remaining
		System.out.println(seconds + " seconds is " + minutes +
			" minutes and " + remainingSeconds + " seconds");
		System.out.println(Math.pow(2, 3)); // calculating exponents

		long ssn = 232_45_4519; // Can use _ to seperate numbers.
		long creditCardNumber = 2324_4545_4519_3415L; // Must add L for long long integers.



	}
}