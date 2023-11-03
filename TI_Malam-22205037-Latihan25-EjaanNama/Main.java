/* 
 Name : Mochamad Sofyan
 NIM : 22205037
 PRODI : TEKNIK INFORMATIKA
 DESKRIPSI PROGRAM : Ejaan Nama
*/

// Import the Java library
import java.util.Scanner;

// Initialize the Main class
public class Main {

    // Execute the main method
    public static void main(String[] args) {

        // Initialize a scanner for input and set variables
        Scanner input = new Scanner(System.in);
        String name;

        // Enter the first name
        System.out.print("Enter your first name to spell: ");
        name = input.nextLine();

        // Display the spelling
        System.out.println("Spelling for " + "\"" + name + "\"" + " is: ");

        // Loop as a letter-by-letter breaker using charAt
        for (int i = 0; i < name.length(); i++) {
            char character = name.charAt(i);

            // And display
            System.out.println("Letter " + (i + 1) + " : " + character);
        }
    }
}
