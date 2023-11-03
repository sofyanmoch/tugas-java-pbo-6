/* 
 Name : Mochamad Sofyan
 NIM : 22205037
 PRODI : TEKNIK INFORMATIKA
 DESKRIPSI PROGRAM : Huruf besar dan kecil
*/

// Import the Java library
import java.util.Scanner;

// Initialize the Main class
public class Main {

    // Execute the main method
    public static void main(String[] args) {

        // Initialize a scanner for input and set variables
        Scanner input = new Scanner(System.in);
        String sentence;

        // Enter a sentence
        System.out.print("Enter a sentence: ");
        sentence = input.nextLine();

        // Display the result
        System.out.println();
        System.out.println("==== Formatting Result ====");

        // Uppercase result
        System.out.println("Uppercase: " + sentence.toUpperCase());

        // Lowercase result
        System.out.println("Lowercase: " + sentence.toLowerCase());
    }
}
