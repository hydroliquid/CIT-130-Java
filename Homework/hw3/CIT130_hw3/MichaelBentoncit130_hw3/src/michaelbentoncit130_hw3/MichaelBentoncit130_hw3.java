/*
    Name: Michael Benton
    Class name: CIT 130
    Date Assigned: 9/3/2018
    Date Due: 9/13/2018

    Write the pseudocode and the Java program to calculate future value of
    investment using compound interest. The pseudocode will be placed in the
    comments section of the Java program at the beginning of the program file.

    A program to calculate future value of investment using compound interest.
    Input-
    balance - amount after compounded
    principal - Original amount of deposit
    rate - annual intrest rate calculated
    apr - whole number inputed by user
    comp - amount of times per year that the interest in compounded
    years - number of years to compound

    Processing-
    rate = apr / 100
    balance = principal(1 + rate / comp)e(comp * years)

    Ouput-
    principal - Original amount of deposit
    apr - number user imputed
    comp - amount of times per year that the interest in compounded
    balance - Final balance after compunded

    Pseudo code -
    1. Start
    2. Write "Enter the original balance: "
    3. Input principal
    4. Write "Enter the annual interest rate: "
    5. Input apr
    6. Calculate rate = apr / 100
    7. Write "Enter the number of times per year that the \n" +
       "interest is compounded: "
    8. Input comp
    9. Write "Enter the number of years for the account to earn interest: "
   10. Input years
   11. Calulate balance = principal(1 + rate / comp)e(comp * years)
   12. Write "************ ACME BANK"
   13. Write "Original Balance = $" + principal
   14. Write "Annual interest rate = " + apr + "%"
   15. Write "Interested compounded " + comp + " times per year."
   16. Write "Number of years = " + years
   17. Write "Final balance after " + years + "at an annual rate of " + apr
             + "% compounded " + comp + " times per year is : "
             + Typecast (int)(balance * 100) / 100

   Time taken to complete this program: 2 hrs
 */
package michaelbentoncit130_hw3;

import java.util.*;

public class MichaelBentoncit130_hw3
{

    public static void main(String[] args)
    {
        // setting the scanner
        Scanner Get = new Scanner(System.in);

        // declaring variables
        double balance;
        double principal;
        double rate;
        double apr;
        int comp;
        int years;

        // Ask user for input
        System.out.print("Enter the original balance: ");
        principal = Get.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        apr = Get.nextDouble();
        // Getting the decimal value for the APR
        rate = apr / 100;

        System.out.print("Enter the number of times per year that the \n" +
                         "interest is compounded: ");
        comp = Get.nextInt();

        System.out.print("Enter the number of years for the account to \n" +
                         "earn interest: ");
        years = Get.nextInt();
        // Calculate the final balance
        balance = principal * Math.pow((1 + rate / comp), (comp* years));

        // Display output
        System.out.println("************ ACME BANK");
        System.out.println("Original Balance = $" + principal);
        System.out.println("Annual interest rate = " + apr + "%");
        System.out.println("Interested compounded " + comp +
                         " times per year.");
        System.out.println("Number of years = " + years);
        // Added typecast onto balance to get rid of extra decimal places
        System.out.println("Final balance after " + years +
                         " years at an annual rate of " + apr +
                         "% compounded " + "\n" + comp +
                         " times per year is : " +
                         (int)(balance * 100) / 100.0);
    }

}
