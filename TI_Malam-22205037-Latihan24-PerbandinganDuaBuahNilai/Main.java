/* 
 Name : Mochamad Sofyan
 NIM : 22205037
 PRODI : TEKNIK INFORMATIKA
 DESKRIPSI PROGRAM : Perbandingan Dua Buah Nilai
*/

// Import the Java library
import java.util.Scanner;

// Initialize the Main class
public class Main {

	// Run the main method
	public static void main(String[] args) {

		// Initialize a scanner for input and set variables
		Scanner input = new Scanner(System.in);
		int firstValue, secondValue;
		String askAgain;
		 
		// Loop indefinitely
		while (true) {

			// Enter the first value
			System.out.print("Enter the first value: ");
			firstValue = input.nextInt();
		 
			// Enter the second value
			System.out.print("Enter the second value: ");
			secondValue = input.nextInt();
		 
			// Clear the input as a new line
			input.nextLine(); 
		 
			// If the first value is greater than the second value
			if (firstValue > secondValue) {

				// Display
				System.out.println("Result: " + firstValue + " is greater than " + secondValue);

			// If the first value is less than the second value
			} else if (firstValue < secondValue) {

				// Display
				System.out.println("Result: " + firstValue + " is less than " + secondValue);

			// If the first value is equal to the second value
			} else if (firstValue == secondValue) {

				// Display
				System.out.println(firstValue + " is equal to " + secondValue);
			}
		 
			// Ask if the user wants to repeat the activity
			System.out.print("Repeat the activity? (Yes/No): ");
			askAgain = input.nextLine();
		 
			// If "Yes," repeat the activity
			if (askAgain.equalsIgnoreCase("Yes")) {
				continue;

			// If the answer is "No," stop the program
			} else if (askAgain.equalsIgnoreCase("No")) {
				break;
			}
		}
	}
}
