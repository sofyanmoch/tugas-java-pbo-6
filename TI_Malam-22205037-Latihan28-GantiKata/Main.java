/* 
 Name : Mochamad Sofyan
 NIM : 22205037
 PRODI : TEKNIK INFORMATIKA
 DESKRIPSI PROGRAM : Ganti Kata
*/

import java.util.Scanner;

// Initialize the Main class
public class Main {

    // Execute the main method
    public static void main(String[] args) {

        // Initialize a scanner for input and set variables
        Scanner input = new Scanner(System.in);
        String sentence, replaceWord, newWord, formattedNewWord;

        // Enter a sentence
        System.out.print("Enter a sentence: ");
        sentence = input.nextLine();

        // Enter the word to replace
        System.out.print("Replace word: ");
        replaceWord = input.nextLine();

        // Enter the new word
        System.out.print("With word: ");
        newWord = input.nextLine();

        // Set a variable to replace the new word
        formattedNewWord = sentence.replace(replaceWord, newWord);
        System.out.println();

        // Display the result
        System.out.println("=== Formatting Result ===");
        System.out.println("Original sentence: " + sentence);
        System.out.println("New sentence: " + formattedNewWord);

    }
}
