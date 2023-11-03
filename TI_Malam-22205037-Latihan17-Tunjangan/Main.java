/* 
 Name : Mochamad Sofyan
 NIM : 22205037
 PRODI : TEKNIK INFORMATIKA
 DESKRIPSI PROGRAM : Tunjangan
*/

import java.util.Scanner;

public class Main {

    public static double hitungTunjangan(double gajiPokok, boolean isMarried) {
        return isMarried ? gajiPokok * 0.35 : 0; 
    } 

    public static double hitungTotalGaji(double gajiPokok, double tunjangan) {
        return gajiPokok + tunjangan;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Program Tunjangan =====");
        // input gajipokok
        System.out.print("Berapa gaji pokok anda perbulan? : ");
        double gajiPokok = scanner.nextDouble();

        // input is married or not
        System.out.print("Apakah anda sudah menikah? (y/n) : ");
        String menikah = scanner.next();

        // Declare tunjangan
        double tunjangan = 0;

        if (menikah.equals("y")) {
            tunjangan = hitungTunjangan(gajiPokok, true);
        } else if (menikah.equals("n")) {
            tunjangan = hitungTunjangan(gajiPokok, false);
        } else {
            System.out.println("Input tidak valid. Masukkan 'y' atau 'n' saja.");
        }

        System.out.println("===== Hasil Perhitungan =====");
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Tunjangan : " + tunjangan);
        System.out.println("Gaji Total : " + hitungTotalGaji(gajiPokok, tunjangan));
        
        scanner.close();
    }
}