/* 
 Name : Mochamad Sofyan
 NIM : 22205037
 PRODI : TEKNIK INFORMATIKA
 DESKRIPSI PROGRAM : Perhitungan Lingkaran
*/

// Import Java library
import java.util.Scanner;

// Initialize the Main class
public class Main {

    // Run the main method
    public static void main(String[] args) {

        try {

            // Initialize the input scanner
            Scanner scanner = new Scanner(System.in);

            // Display program name
            System.out.println("===Circle Calculation===");

            // Enter the diameter of the circle
            System.out.print("Enter the diameter of the circle: ");
            int diameter = scanner.nextInt();

            // Calculate the circle's radius
            int radius = diameter / 2;
            double area = Math.PI * radius * radius;
            double circumference = 2 * Math.PI * radius;

            // Display the results
            System.out.println("===Circle Calculation Results===");
            System.out.println("Circle radius = " + radius + " cm");
            System.out.printf("Circle area = %.2f cm²\n", area);
            System.out.printf("Circle circumference = %.2f cm\n", circumference);

            // Handle errors when the input is not valid
        } catch (Exception e) {
            System.out.println("Invalid diameter value.");
        }
    }
}
