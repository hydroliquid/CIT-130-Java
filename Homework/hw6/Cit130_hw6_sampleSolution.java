//  Name: Foo Bar
//  Class Name: CIT130
//  Date Assigned:
//  Date Due:
//  This program will offer a menu of choices
//	option 1 - process grades and validate input
//	option 2 - Process purchases including data validation
//  option 3 - Exit the menu
//  Input Variables:
//  option - Variable to choose which menu option to perform.
//  assignments - Variable to determine how many assignments will be scored.
//  score - Variable for inputting the score of assignments.
//  examScore - Variable for inputting the score for exams.
//  finalExam - Variable for the final exam score.
//  price - Variable for inputting the price.
//  Output Variables:
//  count - Variable to output the assignment number and number of items
//  purchased.
//  grade - Variable for the overall grade after all assignments and exams.
//  totalPrice - Variable for the price of all items purchased.
//  truePrice - Variable for the total price after tax.
//  averagePrice - Variable for the average price after tax.
//  Time taken to complete this program: 3 hours

import java.util.Scanner;

public class Cit130_hw6_sampleSolution
{
    public static void main(String[] args)
    {
        final double TAXRATE = 0.08;  //constant value for TAX rate
        int option = 0;
        int assignments = 0;
        int count = 0;
        int score = 0;
        int accumulatedScore = 0;
        double assignmentAverage = 0;
        int examScore = 0;
        int firstExam = 0;
        int secondExam = 0;
        int finalExam = 0;
        double grade = 0;
        double price = 0;
        double totalPrice = 0;
        double truePrice = 0;
        double averagePrice = 0;

        Scanner input = new Scanner(System.in);
        //  Prompt user for menu option choice.
        System.out.println("Enter 1 to calculate grade,\nenter 2 to calculate"
        + " purchases,\nenter 3 to exit the program.");
        System.out.print("Enter an option: ");
        option = input.nextInt();
        //  While loop for looping the menu.
        while (option != 3)
        {
            //  While loop to loop against invalid input for menu choice.
            while (option < 1 || option > 3)
            {
                System.out.println("The option you entered is incorrect.\n");
                System.out.println("Enter 1 to calculate grade,\nenter 2 to "
                + "calculate purchases,\nenter 3 to exit the program.");
                System.out.print("Enter an option: ");
                option = input.nextInt();
            }
            //  IF statement for calculating the grade.
            if (option == 1)
            {
                //  Prompt user for number of assignments.
                System.out.print("\nEnter the number of assignments: ");
                assignments = input.nextInt();
                //  While loop to prevent invalid input of number of
                //  assignments.
                while (assignments < 1)
                {
                    System.out.println("The number you entered is incorrect.");
                    System.out.print("Enter the number of assignments (1 or "
                    + "more): ");
                    assignments = input.nextInt();
                }
                //  FOR loop to input the assignment scores.
                for (count = 1; count <= assignments; count++)
                {
                    //  Prompt user for assignment score.
                    System.out.print("Enter the score for assignment " + count
                    + ": ");
                    score = input.nextInt();
                    //  While loop to prevent input of invalid score.
                    while (score < 0 || score > 100)
                    {
                        System.out.println("The score you entered is "
                        + "incorrect.");
                        System.out.print("Enter the score for assignment "
                        + count + " (0 - 100): ");
                        score = input.nextInt();
                    }
                    //  Calculate the total score of assignments.
                    accumulatedScore = accumulatedScore + score;
                }
                //  Calculate the average score of assignments.
                assignmentAverage = (double)accumulatedScore / assignments;
                //  FOR loop to input exam scores.
                for (count = 1; count < 3; count++)
                {
                    //  Prompt user for exam score.
                    System.out.print("Enter the score for exam " + count
                    + ": ");
                    examScore = input.nextInt();
                    //  While loop to prevent input of invalid score.
                    while (examScore < 0 || examScore > 100)
                    {
                        System.out.println("The score you entered is "
                        + "incorrect.");
                        System.out.print("Enter the score for exam " + count
                        + " (0 - 100): ");
                        examScore = input.nextInt();
                    }
                    //  IF statement to store score for exam 1.
                    if (count == 1)
                    {
                        firstExam = examScore;
                    }
                    //  Else statement to store score for exam 2.
                    else
                    {
                        secondExam = examScore;
                    }
                }
                //  Prompt user for final exam score.
                System.out.print("Enter the score for the final exam: ");
                finalExam = input.nextInt();
                //  While loop to prevent input of invalid score.
                while (finalExam < 0 || finalExam > 100)
                {
                    System.out.println("The score you entered is incorrect.");
                    System.out.print("Enter the score for the final exam (0 - "
                    + "100): ");
                    finalExam = input.nextInt();
                }
                //  Calculate the grade.
                grade = (assignmentAverage * 0.65) + (firstExam * 0.1) +
                (secondExam * 0.1) + (finalExam * 0.15);
                //  Output overall grade.
                System.out.println("\n*** Student Report ***");
                System.out.printf("Overall Grade: %.2f", grade);
                System.out.println("");
                //  Output letter grade.
                System.out.print("Letter Grade: ");
                //  IF-else statements to determine which letter grade to
                //  output.
                if (grade >= 94)
                {
                    System.out.print("A");
                }
                else if (grade >= 90)
                {
                    System.out.print("A-");
                }
                else if (grade >= 87)
                {
                    System.out.print("B+");
                }
                else if (grade >= 84)
                {
                    System.out.print("B");
                }
                else if (grade >= 80)
                {
                    System.out.print("B-");
                }
                else if (grade >= 77)
                {
                    System.out.print("C+");
                }
                else if (grade >= 74)
                {
                    System.out.print("C");
                }
                else if (grade >= 70)
                {
                    System.out.print("C-");
                }
                else if (grade >= 67)
                {
                    System.out.print("D+");
                }
                else if (grade >= 64)
                {
                    System.out.print("D");
                }
                else if (grade >= 60)
                {
                    System.out.print("D-");
                }
                else
                {
                    System.out.print("F");
                }
                System.out.println("\n");
            }
            //  IF statement for calculating price.
            if (option == 2)
            {
                //  Prompt user for the price of an item.
                System.out.print("\nEnter the price of an item (or the number 0"
                + " or less to stop): $");
                price = input.nextDouble();
                count = 0;
                //  IF statement for initial zero or negative price.
                if (price <= 0)
                {
                    System.out.println("No data was entered.\n");
                }
                //  While loop for inputting and calculating the total price.
                while (price > 0)
                {
                    //  Count the number of items sold.
                    count++;
                    //  Calculate the total price before tax.
                    totalPrice = totalPrice + price;
                    System.out.print("Enter the price of an item (or the number"
                    + " 0 or less to stop): $");
                    price = input.nextDouble();
                }
                //  IF statement to output the price information if an item was
                //  purchased.
                if (count > 0)
                {
                    System.out.println("\n*** Report ***");
                    //  Output the total price before tax.
                    System.out.printf("Total price of purchases: $%,.2f\n",
                    totalPrice);
                    //  Output the number of items purchased.
                    System.out.println("Number of items purchased: " + count);
                    //  Calculate the total price after tax.
                    truePrice = totalPrice + (totalPrice * TAXRATE);
                    //  Output the total price after tax.
                    System.out.printf("Total price plus tax (8%%): $%,.2f\n",
                    truePrice);
                    //  Calculate the average price after tax.
                    averagePrice = truePrice / count;
                    //  Output the average price after tax.
                    System.out.printf("Average Price: $%,.2f\n\n",
                    averagePrice);
                }
            }
            //  Prompt user for menu option choice.
            System.out.println("Enter 1 to calculate grade,\nenter 2 to "
            + "calculate purchases,\nenter 3 to exit the program.");
            System.out.print("Enter an option: ");
            option = input.nextInt();
        }
        System.out.println("Thanks for using my program program.");
    }
}//Cit130_hw6_sampleSolution
