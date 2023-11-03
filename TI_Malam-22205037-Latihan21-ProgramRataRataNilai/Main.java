/* 
 Name : Mochamad Sofyan
 NIM : 22205037
 PRODI : TEKNIK INFORMATIKA
 DESKRIPSI PROGRAM : Program Rata Rata Nilai
*/

// Import the Java library
import java.util.Scanner;

// Initialize the Main class
public class Main {

    // Run the main method
    public static void main(String[] args) {

        // Declare variables
        double average;

        // Store the values in an array
        int[] grades = new int[100];

        // Initialize the input scanner
        Scanner input = new Scanner(System.in);

        // Ask how many students' grades to input
        System.out.print("Enter the number of students: ");
        double numStudents = input.nextInt();

        // Initialize the sum variable
        int sum = 0;

        // Loop through the students
        for (int i = 1; i <= numStudents; i++) {

            // Ask for the grade of the i-th student
            System.out.print("Grade for student " + i + ": ");
            grades[i] = input.nextInt();

            // Add the grade to the sum
            sum += grades[i];
        }

        // Calculate the average
        average = sum / numStudents;

        // Display the result
        System.out.println("So, the average grade is = " + average);
        System.out.println("Developed By: sofyanmoch");
    }
}
