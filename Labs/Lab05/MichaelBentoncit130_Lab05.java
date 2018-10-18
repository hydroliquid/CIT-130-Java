/*
    Name: Michael Benton
    Class name: CIT 130
    Assaignment: hw6
    Date Assigned: 9/24/2018
    Date Due: 10/7/2018
    Time taken: Hrs mins
*/
import java.util.*;

public class MichaelBentoncit130_Lab05
{
	public static void main(String[] args)
	{
		Scanner get = new Scanner(System.in);

		// 1.)
		char character = ' ';

		while(character != '!')
		{
			System.out.print("Enter a single character(enter ! to stop): ");
			character = get.nextLine().charAt(0);
			switch(character)
			{
				case 'a': case 'e': case 'i': case 'o': case 'u':
					System.out.println("vowel");
					break;
				default:
					System.out.println("other");
					break;
			}

		}

		// 2.)
		int count = 0;
		int total = 0;
		for(count = 1; count <= 5; count++)
		{
			System.out.println(count);
			total += count;
		}
		System.out.println("The total of 1+2+3+4+5 " + total);

		char star = '*';

		for(int i = 1; i <= 4; i++)
		{

			for(int x = 1; x <= i; x++)
			{
				System.out.printf("%-5c", star);

			}
			System.out.println();
		}

	}
}