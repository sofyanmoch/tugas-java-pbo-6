/* 
 Name : Mochamad Sofyan
 NIM : 22205037
 PRODI : TEKNIK INFORMATIKA
 DESKRIPSI PROGRAM : Target Saldo Tabungan
*/

// Import Java libraries
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

// Initialize the Main class
public class Main {

    // Run the main method
    public static void main(String[] args) {

	// Initialize the input scanner
        Scanner inputScanner = new Scanner(System.in);

	// Declare variables
        int initialBalance, monthlyInterestRate, targetBalance;

 	// Ask for the initial balance
        System.out.print("Initial Balance (Rp): ");
        initialBalance = inputScanner.nextInt();

	// Ask for the monthly interest rate
        System.out.print("Monthly Interest Rate (%): ");
        monthlyInterestRate = inputScanner.nextInt();

	// Ask for the target balance
        System.out.print("Target Balance (Rp): ");
        targetBalance = inputScanner.nextInt();

	// Calculate the number of months to reach the target balance
        int months = (targetBalance - initialBalance) / (initialBalance * monthlyInterestRate / 100);

 	// Initialize a decimal value formatter 
        NumberFormat formatter = new DecimalFormat("#,###,###");

  	// Loop through the months	  
        for (int i = 1; i <= months; i++) {
        	 
	    // Calculate the updated balance
            initialBalance += initialBalance * monthlyInterestRate / 100;

	    // Format the balance to a decimal format
            String formattedBalance = "Rp. " + formatter.format(initialBalance);

	    // Replace comma (,) with a period (.) for formatting
            formattedBalance = formattedBalance.replace(",", ".");
	
	    // Display the result
            System.out.println("Balance in month " + i + " " + formattedBalance);
        }
    }
}
