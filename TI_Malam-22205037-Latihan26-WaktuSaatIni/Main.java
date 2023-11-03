/* 
 Name : Mochamad Sofyan
 NIM : 22205037
 PRODI : TEKNIK INFORMATIKA
 DESKRIPSI PROGRAM : Generate Waktu Saat ini
*/

// Import the Java library
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// Initialize the Main class
public class Main {

    // Execute the main method
    public static void main(String[] args) {

        // Set a variable for the current local date and time
        LocalDateTime myDateObj = LocalDateTime.now();

        // Format it for Indonesia
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, dd MMM yyyy HH:mm:ss", Locale.forLanguageTag("in-ID"));
        String formattedDate = myDateObj.format(myFormatObj);

        // Display
        System.out.println("Current Date/Time : " + formattedDate);
    }
}
