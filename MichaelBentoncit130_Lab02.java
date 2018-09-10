/*
    Name: Michael Benton
    Class name: CIT 130
    Date Assigned: 9/5/2018
    Date Due: 9/5/2018
    * 
    * a) Calculating quarters, dimes, and nickles into pennies.
    * Input-
    * nickels - number of nickles
    * dimes - number of dimes
    * quarters - number of quarters
    * 
    * Processing-
    * pennies = quarters * 25
    * pennies = nickels * 5
    * pennies = dimes * 10
    * totalValue = pennies
    * 
    * Ouput-
    * totalValue - total number of pennies
    * 
        b) Calculating the force between to bodies of masses.
        * Constants -
        * k - The gravitational constant 6.673*10e-11
        * 
        * Input -
        * m1 - first body of mass
        * m2 - second body of mass
        * dis - the distance between mass1 and mass2
        * 
        * Processing - 
        * F = (k * ((m1*m2) / (dis*dis )))
        * 
        * Output -
        * F - force calulated
        * 
            c) Input - 
            * name - name of employee
            * gender - gender of employee
            * employeeID - Employee ID number
            * hours - Hours employee has worked
            * payRate - Dollars an hour 
            * 
            * Processing -
            * totalPay = hours * payRate;
            * 
            *  Output -
            * totalPay - Total pay for hours worked.
            *   
    * Time taken to complete this program: 2 h 15 min
 */

import java.util.Scanner;

public class MichaelBentoncit130_Lab02 
{
	
    
	public static void main (String args[]) 
    {
        // setting the scanner
        Scanner Get = new Scanner(System.in);
        
        // a)
        //declaring variables
		int quarters;
        int dimes;
        int nickels;
        int pennies;
        int totalValue;
        
        // Asking user for input
        System.out.print("Please enter the number of quarters: "); 
        quarters = Get.nextInt();
        
        System.out.print("Please enter the number of dimes: ");
        dimes = Get.nextInt();
        
        System.out.print("Please enter the number of nickels: ");
        nickels = Get.nextInt();
        
        totalValue = pennies = (quarters * 25) + (dimes * 10) + 
                        (nickels * 5);
        
        System.out.println("The total number of pennies is " + totalValue 
                            + "\n");
                            // Added next line syntax to create space
                            // between programs
        //----------------------------------------------------------------------
        // b)
        //declaring constant
        final double k = 6.673e-11;
        
        // Declare variables
        double dis;
        double m1;
        double m2;
        double F;
        
        // Ask the user for input
        System.out.print("Please enter the distance between two masses" +
                        " in meters: ");
        dis = Get.nextDouble();
        System.out.print("Please enter the mass of object one in " +
                        "kilograms: ");
        m1 = Get.nextDouble();
        System.out.print("Please enter the mass of object two in " + 
                        "kilograms: ");
        m2 = Get.nextDouble();
        // Calculating force
        F = (k * ((m1*m2) / (dis*dis )));
        // Displaying the total force
        System.out.println("The total force according to Newton's law " +
                            "is " + F + "N" + "\n"); 
                            // Added next line syntax to create space
                            // between programs
        
        //----------------------------------------------------------------------
        // c)
        // Declaring Variables
        String name;
        char gender;
        int employeeID;
        double hours;
        double payRate;
        double totalPay;
        
        // Add get input line to stop the skip
        name = Get.nextLine();
        // Ask the user for data
        System.out.print("Please enter your name: ");
        name = Get.nextLine();
        
        System.out.print("Please enter your gender - m/f: ");
        gender = Get.nextLine().charAt(0);
        
        System.out.print("Please enter your 4-digit employee ID: ");
        employeeID = Get.nextInt();
        
        System.out.print("Please enter your hours worked: ");
        hours = Get.nextDouble();
        
        System.out.print("Please enter your pay rate: ");
        payRate = Get.nextDouble();
        
        // Calculate total pay
        totalPay = hours * payRate;
        
        // Display Variables
        System.out.print("Name: " + name + "\n"
                        + "Gender: " + gender + "\n"
                        + "Employee ID: " + employeeID + "\n" 
                        + "Total Pay: " + totalPay);
        
        
	}
}

