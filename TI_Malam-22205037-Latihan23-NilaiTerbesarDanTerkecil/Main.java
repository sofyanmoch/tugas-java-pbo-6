/* 
 Name : Mochamad Sofyan
 NIM : 22205037
 PRODI : TEKNIK INFORMATIKA
 DESKRIPSI PROGRAM : Mencari Nilai Terbesar dan Terkecil
*/

// Import the Java library
import java.util.Scanner;

// Initialize the Main class
public class Main {

    // Run the main method
    public static void main(String[] args) {

        // Initialize a scanner for input and set variables
        Scanner input = new Scanner(System.in);
        int[] arr = new int[100];
        int arr_count, i, max_num, min_num;
        String tanyaPetugas;

        // Display the program name
        System.out.println("=====Program to Find the Largest and Smallest Student Grade=====");
        System.out.println();

        // Enter the name of the supervisor
        System.out.print("Enter the name of the supervisor: ");
        tanyaPetugas = input.nextLine();

        // Enter the number of student grades
        System.out.print("Enter the number of student grades: ");
        arr_count = input.nextInt();

        // Loop to input student grades
        for (i = 0; i < arr_count; i++) {

            // Ask for the grade of the i-th student
            System.out.print("Enter the grade for student " + (i + 1) + " = ");
            arr[i] = input.nextInt();

        }

        // Initialize max_num and min_num as temporary values from the array
        max_num = arr[0];
        min_num = arr[0];

        // Loop to process the grades
        for (i = 0; i < arr_count; i++) {

            // If the grade is greater
            if (arr[i] > max_num) {

                // Update the max_num variable
                max_num = arr[i];
            }

            // If the grade is smaller
            if (arr[i] < min_num) {

                // Update the min_num variable
                min_num = arr[i];
            }
        }

        // Display the results
        System.out.println();
        System.out.println("=====Student Grades=====");

        for (i = 0; i < arr_count; i++) {
            System.out.println("Grade for student " + (i + 1) + " = " + arr[i]);
        }

        System.out.println();
        System.out.println("The highest grade is: " + max_num);
        System.out.println("The lowest grade is: " + min_num);
        System.out.println("Supervisor: " + tanyaPetugas);

    }

}
