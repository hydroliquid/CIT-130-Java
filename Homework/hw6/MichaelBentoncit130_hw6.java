/*
    Name: Michael Benton
    Class name: CIT 130
    Assaignment: hw6
    Date Assigned: 9/24/2018
    Date Due: 10/7/2018
    Time taken: 3 Hrs mins



	Psuedo code

    Input-
    counter - counter for loop
    assaign - assaignment in a course
    score - score holder
	scoreTotal - score total
	scoreAve - score total / assaignments
	scoreGrade - score percentage of grade
	exam1 - number grade for exam
	exam2 - number grade for exam
	exam3 - number grade for exam
	gradeNum - grade total
	grade - grade

    Ouput-


	1. Start
	2. sop ("Enter the number of assaignments: ")
	3. get assaign
	4. Start loop while (counter <= assaign)
	5. sop ("Enter grade for assaignment " + counter + ":")
	6. get score
	7. check score >= 0 && score <= 100
	8. scoreTotal += score
	9. Calculate score average
	10. scoreAve = scoreTotal / assaign
	11. sop ("Enter grade for exam 1: ")
	12. get exam1
	13. check exam1 >= 0 && exam1 <= 100
	14. sop ("Enter grade for exam 2: ")
	15. get exam2
	16. check exam2 >= 0 && exam2 <= 100
	17. sop ("Enter grade for final exam: ")
	18. get exam3
	19. check exam3 >= 0 && exam3 <= 100
	20. Calculate exams
	21. exam1 = exam1 * 0.1
	22. exam2 = exam2 * 0.1
	23. exam3 = exam3 * 0.15
	24. scoreGrade = scoreAve * 0.65
	25. gradeNum = exam1 + exam2 + exam3 + scoreGrade
	26. Calculate letter grade
	if(gradeNum >= 94)
	grade = A
	else if(gradeNum >= 90 && gradeNum < 94)
	grade = A-
	else if(gradeNum >= 87 && gradeNum < 90)
	grade = B+
	else if(gradeNum >= 84 && gradeNum < 87)
	grade = B
	else if(gradeNum >= 80 && gradeNum < 84)
	grade = B-
	else if(gradeNum >= 77 && gradeNum < 80)
	grade = C+
	else if(gradeNum >= 74 && gradeNum < 77)
	grade = C
	else if(gradeNum >= 70 && gradeNum < 74)
	grade = C-
	else if(gradeNum >= 67 && gradeNum < 70)
	grade = D+
	else if(gradeNum >= 64 && gradeNum < 67)
	grade = D
	else if(gradeNum >= 60 && gradeNum < 64)
	grade = D-
	else(gradeNum < 60)(expression not needed)
	grade = F
	27. sop ("***Student Report***")
	28. sop ("Overall grade: " + gradeNum)
	29. sop ("Letter grade: " + grade)

	Part 2)
	A program to calculate the prices for any number of items.

	// Psuedo code
	Input
	price - price holder
	beforeTotal - Total purchases before taxes
	priceAve - average price
	itemCount - item counter
	priceTax - amount of tax from purchase
	finalPrice - priceTax + beforeTotal

	Constant
	tax - constant for tax

	1. Start
	2. start loop while (price > 1)
	3. sop ("Enter the price of an item(any negative number to end): ")
	4. get price
	5. beforeTotal = beforeTotal + price
	6. itemCount += 1;
	7. priceTax = beforeTotal * tax
	8. finalPrice - priceTax + beforeTotal
	9. priceAve = finalPrice / itemCount
	10. sop ("*** Report ***")
	11. sopf ("Total amount of purchases: $%2.2f", beforeTotal)
	12. sop ("Number of items purchased: " + itemCount)
	13. sopf ("Total amount plus tax (8%): $%2.2f", finalPrice)
	14. sopf ("Average Price: $%2.2f", priceAve)


*/

import java.util.*; // Get scanner class

public class MichaelBentoncit130_hw6
{
	public static void main(String[] a)
	{
		// Initialize Scanner
		Scanner get = new Scanner(System.in);

		// Initialize variables
		int counter = 1;
		int assaign = 0;
		double score = 0.0;
		double scoreTotal = 0.0;
		double scoreAve = 0.0;
		double scoreGrade = 0.0;
		double examTemp = 0.0;
		double exam1 = 0.0;
		double exam2 = 0.0;
		double exam3 = 0.0;
		double gradeNum = 0.0;
		String grade = " ";

		// Get number of assaignments
		System.out.print("Enter 1 or greater for number of assaignments: ");
		assaign = get.nextInt();

		// Get assaignment scores
		while (counter <= assaign)
		{
			System.out.print("Enter grade for assaignment " + counter + ":");
			score = get.nextDouble();
			if(score >= 0 && score <= 100)
			{
				scoreTotal += score;
				counter += 1;
			}
			else
			{
				System.out.println("Score must be between 0 and 100.");
				counter = counter;
			}
		}
		// Calculate score average
		scoreAve = Average(scoreTotal, assaign);
		scoreGrade = scoreAve * 0.65;

		// reset counter
		counter = 1;
		// Get exam 1 and exam 2
		while(counter <= 2)
		{
			System.out.print("Enter grade for exam " + counter + ": ");
			examTemp = get.nextDouble();
			if(examTemp >= 0 && examTemp <= 100)
			{
				if(exam1 < 1.0)
				{
					exam1 = examTemp * 0.1;
					counter += 1;
				}
				else
				{
					exam2 = examTemp * 0.1;
					counter += 1;
				}
			}
			else
			{
				System.out.print("Score must be between 0 and 100.");
				counter = counter;
			}
		}
		// Reset counter
		counter = 1;
		// Get final exam
		while(counter <= 1)
		{
			System.out.print("Enter grade for final exam: ");
			exam3 = get.nextDouble();
			if(exam3 >= 0 && exam3 <= 100)
			{
				exam3 = exam3 * 0.15;
				counter += 1;
			}
			else
			{
				System.out.print("Score must be between 0 and 100.");
				counter = counter;
			}
		}
		// Calculate Grade
		gradeNum = exam1 + exam2 + exam3 + scoreGrade;
		// Get letter grade
		grade = GetGrade(gradeNum);

		// Display report
		System.out.println("***Student Report***");
		System.out.println("Overall grade: " + gradeNum);
		System.out.println("Letter grade: " + grade);

		// Part 2
		// Initialize variables
		int itemCount = 0;
		double price = 1.1;
		double beforeTotal = 0.0;
		double priceAve = 0.0;
		double priceTax = 0.0;
		double finalPrice = 0.0;
		char percent = '%';

		// Initialize Constant
		final double tax = 0.08;

		//Start
		System.out.print("Enter the price of an item(any negative"
							+"number to end): ");
		price = get.nextDouble();

		while (price > 0)
		{
			if(price > 0)
			{
				beforeTotal = beforeTotal + price;
				itemCount += 1;
				System.out.print("Enter the price of an item(any negative"
											+"number to end): ");
				price = get.nextDouble();
			}
			else
			{// Do nothing
			}
		}
		if(itemCount > 0)
		{
			priceTax = beforeTotal * tax;
			finalPrice = priceTax + beforeTotal;
			priceAve = Average(finalPrice, itemCount);
			System.out.println();
			System.out.println("*** Report ***");
			System.out.printf("Total amount of purchases: $%2.2f", beforeTotal);
			System.out.println();
			System.out.println("Number of items purchased: " + itemCount);
			System.out.printf("Total amount plus tax (8%1c): $%2.2f",percent, finalPrice);
			System.out.println();
			System.out.printf("Average Price: $%2.2f", priceAve);
			System.out.println();
		}
		else
		{
			System.out.println("No data was entered");
		}


	}

	public static String GetGrade(double gradeNum)
	{
		String grade = " ";

		if(gradeNum >= 94)
			grade = "A";
		else if(gradeNum >= 90 && gradeNum < 94)
			grade = "A-";
		else if(gradeNum >= 87 && gradeNum < 90)
			grade = "B+";
		else if(gradeNum >= 84 && gradeNum < 87)
			grade = "B";
		else if(gradeNum >= 80 && gradeNum < 84)
			grade = "B-";
		else if(gradeNum >= 77 && gradeNum < 80)
			grade = "C+";
		else if(gradeNum >= 74 && gradeNum < 77)
			grade = "C";
		else if(gradeNum >= 70 && gradeNum < 74)
			grade = "C-";
		else if(gradeNum >= 67 && gradeNum < 70)
			grade = "D+";
		else if(gradeNum >= 64 && gradeNum < 67)
			grade = "D";
		else if(gradeNum >= 60 && gradeNum < 64)
			grade = "D-";
		else
			grade = "F";

		return grade;
	}

	public static double Average(double total, int count)
	{
		double average = 0.0;
		average = total / (double)count;
		return average;
	}


}//end class