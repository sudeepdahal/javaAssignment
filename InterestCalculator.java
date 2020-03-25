import java.util.*;
public class InterestCalculator {
    public static void main(String[] args) {
    	// Header part of ABC Bank
        System.out.println("------------------------------------------\n \t ABC Bank\n \t Return on Bank Term Deposits\n-------------------------------------------"); 
        // Declaring and Initializing the required variables according to data type
        String clientName;
        double depositAmt,term,expectedInterest,finalBalance;
        double rate = 0;
        // Initializing Scanner class for inputing values from user
        Scanner in = new Scanner(System.in);
        // Input user data and storing into the variables
        System.out. print("Enter Client's name: ");
        clientName = in.nextLine();
        System.out. print("Enter Deposit Amount: $");
        depositAmt = in.nextFloat();
        System.out. print("Enter term (in months): ");
        term = in.nextFloat();
        // Assigning interest rate into rate variable after checking the condition of deposit amount
        if (depositAmt >=0 && depositAmt <=1000) { rate =  2.0; }
        else if (depositAmt >1000 && depositAmt <=5000) { rate = 2.5; }
        else if (depositAmt >5000 && depositAmt <=10000) { rate = 3.0; }
        else if (depositAmt >10000 && depositAmt <=20000) { rate = 3.5; }
        else if (depositAmt >20000) { rate = 4.0; }
        // if the required condition is not met system will exit
        else { System.out.println("Something went wrong"); System.exit(0); }
        // System.out. println("Interest Rate: "+rate);
        // calculating the interest rate after getting the rate
        expectedInterest = (depositAmt*(term/12.0)*rate)/100.0;
        finalBalance = expectedInterest+depositAmt;
        // Printing the calcluated results
        System.out. println("Interest Earned: $"+expectedInterest);
        System.out. println("Final Balance: $"+finalBalance);
    }
}