/* 
 Name : Mochamad Sofyan
 NIM : 22205037
 PRODI : TEKNIK INFORMATIKA
 DESKRIPSI PROGRAM : Warna Kepribadian
*/

// Library import
import java.util.Scanner;

// Main class initiation
public class Main {

    // Show Text color Option
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    // Show Background color Option
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    // Run main method
    public static void main(String[] args) {

        // Init inputan scanner dan set variabel
        Scanner scanner = new Scanner(System.in);
        String inputColour, inputName, personalityResult, colourInputResult;

        // Show colored text
        System.out.println();
        System.out.println(ANSI_RED + "YUK " + ANSI_GREEN + "CEK " + ANSI_YELLOW + "KEPRIBADIANMU " + ANSI_CYAN + "DARI "
                + ANSI_PURPLE + "WARNA " + ANSI_BLUE + "FAVORITMU" + ANSI_WHITE);

        System.out.println();
        System.out.println(ANSI_RED_BACKGROUND + "MERAH");
        System.out.println(ANSI_GREEN_BACKGROUND + "HIJAU");
        System.out.println(ANSI_YELLOW_BACKGROUND + "KUNING");
        System.out.println(ANSI_BLUE_BACKGROUND + "BIRU");
        System.out.println(ANSI_PURPLE_BACKGROUND + "UNGU" + ANSI_RESET);

        System.out.println();

        // input fav color
        System.out.print("Pilih warna favoritmu : ");
        inputColour = scanner.nextLine();

        // input name
        System.out.print("Nama kamu : ");
        inputName = scanner.nextLine();

        // set variable
        personalityResult = "=== Hasil Test Kepribadian " + inputName + " ===";
        colourInputResult = inputColour;

        // show result
        System.out.println();
        System.out.println(personalityResult.toUpperCase());
        System.out.println();

        // if colour selected = biru
        if (inputColour.equalsIgnoreCase("biru")) {
            // show personality colour
            System.out.println("Warna favoritmu adalah " + ANSI_BLUE + colourInputResult.toUpperCase() + ANSI_RESET);
            System.out.println("1. Menyenangkan, \n" +
                    "2. Bijaksana, \n" +
                    "3. Pembawaan diri tenang saat menghadapi masalah, \n" +
                    "4. Dinamis, \n" +
                    "5. Senang berbagi, \n" +
                    "6. Bersahabat, \n" +
                    "7. Tidak terlalu suka menjadi sorotan banyak orang, \n" +
                    "8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");

            // if colour != kuning
        } else if (inputColour.equalsIgnoreCase("kuning")) {
            // show personality colour
            System.out.println("Warna favoritmu adalah " + ANSI_YELLOW + colourInputResult.toUpperCase() + ANSI_RESET);
            System.out.println("1. Optimis, \n" +
                    "2. Suka bergaul, \n" +
                    "3. Periang, \n" +
                    "4. Senang menolong, \n" +
                    "5. Lincah dan aktif, \n" +
                    "6. Tidak suka meremehkan kekurangan orang lain, \n" +
                    "7. Loyal, \n" +
                    "8. Hangat, \n" +
                    "9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil, \n" +
                    "10.Cenderung penakut.");

            // if colour selected != merah
        } else if (inputColour.equalsIgnoreCase("merah")) {
            // show personality colour
            System.out.println("Warna favoritmu adalah " + ANSI_RED + colourInputResult.toUpperCase() + ANSI_RESET);
            System.out.println("1. Periang, \n" +
                    "2. Pemberani, \n" +
                    "3. Berani mengambil risiko dalam setiap langkah, \n" +
                    "4. Menyukai tantangan, \n" +
                    "5. Kurang sabar, \n" +
                    "6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit di kontrol, \n"
                    +
                    "7. Memiliki energi kehangatan dan cinta.");

            // if colour selected != ungu
        } else if (inputColour.equalsIgnoreCase("ungu")) {
            // show personality colour
            System.out.println("Warna favoritmu adalah " + ANSI_PURPLE + colourInputResult.toUpperCase() + ANSI_RESET);
            System.out.println("1. Optimis, \n" +
                    "2. Tidak pernah ragu, \n" +
                    "3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat, \n" +
                    "4. Memiliki ambisi yang besar, \n" +
                    "5. Memiliki empati yang besar, \n" +
                    "6. Memiliki sisi misterius sebab seringkali menutupi perasaanya, \n" +
                    "7. Terkadang bersikap keras kepala dan angkuh.");

            // if colour selected != hijau
        } else if (inputColour.equalsIgnoreCase("hijau")) {
            // show personality colour
            System.out.println("Warna favoritmu adalah " + ANSI_GREEN + colourInputResult.toUpperCase() + ANSI_RESET);
            System.out.println("1. Romantis, \n" +
                    "2. Menyukai hal yang berbau alami dan keindahan, \n" +
                    "3. Teguh pada prinsip, \n" +
                    "4. Menginginkan kesempurnaan, \n" +
                    "5. Mudah cemburu, \n" +
                    "6. Mudah merasa iri, \n" +
                    "7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
        } else {
            // if selected colour not found
            System.out.println("Oops, belum teridentifikasi.");
        }
    }
}
