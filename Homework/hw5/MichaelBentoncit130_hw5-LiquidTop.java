/*
    Name: Michael Benton
    Class name: CIT 130
    Assaignment: hw5
    Date Assigned: 9/17/2018
    Date Due: 9/27/2018
    Time taken: 90mins



	Psuedo code

    Input-
    password - password
	fName - first name
	lName - last name
	title - title
	depart - department
	officePhone - office phone number
	mobilePhone - mobile phone numer
	email - email
	mailCode - office mail code
	randNum - random number
	logNum - log base 10 of randNum
	powNum - randNum raise to the power of 3

    Ouput-
    password - password
	fName - first name
	lName - last name
	title - title
	depart - department
	officePhone - office phone number
	mobilePhone - mobile phone numer
	email - email
	mailCode - office mail code
	randNum - random number
	logNum - log base 10 of randNum
	powNum - randNum raise to the power of 3

	1. Start
	2. sop ("Enter your password")
	3. check password match
	4. sop ("Enter your first name")
	5. get fName
	6. sop ("Enter your last name")
	7. get lName
	8. sop ("Enter your title")
	9. get title
	10. sop ("Enter your department")
	11. get depart
	12. sop ("Enter your office phone number")
	13. get officePhone
	14. sop ("Enter your mobile phone number")
	15. get mobilePhone
	16. sop ("Enter your email")
	17. get email
	18. check for invalid email
	19. sop ("Enter your office mail code")
	20. get mailCode
	21. generate random number Math.random()
	22. sop ("Here is your official business card:")
	23. sop *-----------------------------------------------------------*
	24. sop | fName + lName
	25. sop | depart
	26. sop | Office Phone: + officePhone
	27. sop | Mobile Phone: + mobilePhone
	28. sop | email
	29. sop | Mail code: + mailCode
	30. sop | Your assigned random number: %2.2f, randNum
	31. sop | The log base 10 of your random number is: %2.4f, logNum
	32. sop | The random number raised to the power of 3 is: %2.4f, powNum
	33. sop *-----------------------------------------------------------*

*/

import java.util.*; // Get scanner class

public class MichaelBentoncit130_hw5
{
	public static void main(String[] a)
	{
		// Initialize Scanner
		Scanner get = new Scanner(System.in);

		// Initialize variables
		String password = " ";
		String fName = " ";
		String lName = " ";
		String title = " ";
		String depart = " ";
		String officePhone = " ";
		String mobilePhone = " ";
		String email = " ";
		char mailCode = ' ';
		double randNum = 0.0;
		double logNum = 0.0;
		double powNum = 0.0;

		// Get Password
		System.out.print("Enter your password: ");
		password = get.nextLine();

		// check password
		if(password.equals("java"))
		{
			//Get user data
			System.out.print("Enter your first name: ");
			fName = get.nextLine();

			System.out.print("Enter your last name: ");
			lName = get.nextLine();

			System.out.print("Enter your title: ");
			title = get.nextLine();

			System.out.print("Enter your department: ");
			depart = get.nextLine();

			System.out.print("Enter your office phone number: ");
			officePhone = get.nextLine();

			System.out.print("Enter your mobile phone number: ");
			mobilePhone = get.nextLine();

			System.out.print("Enter your email: ");
			email = get.nextLine();

			if(email.contains("@"))
			{
				System.out.print("");
			}
			else
			{
				System.out.println("ERROR - Invalid email - "
								+ "the program will terminate");
			}

		}
		else
		{
			System.out.println("ERROR - Invalid password - "
							+ "the program will terminate");
		}

		/*
		19. sop ("Enter your office mail code")
		20. get mailCode
		21. generate random number Math.random()
		22. sop ("Here is your official business card:")
		23. sop *-----------------------------------------------------------*
		24. sop | fName + lName
		25. sop | depart
		26. sop | Office Phone: + officePhone
		27. sop | Mobile Phone: + mobilePhone
		28. sop | email
		29. sop | Mail code: + mailCode
		30. sop | Your assigned random number: %2.2f, randNum
		31. sop | The log base 10 of your random number is: %2.4f, logNum
		32. sop | The random number raised to the power of 3 is: %2.4f, powNum
		sop *-----------------------------------------------------------*
		*/
	}

}//end class