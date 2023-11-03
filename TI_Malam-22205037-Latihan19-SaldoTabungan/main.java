/* 
 Name : Mochamad Sofyan
 NIM : 22205037
 PRODI : TEKNIK INFORMATIKA
 DESKRIPSI PROGRAM : Saldo Tabungan
*/

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class main {
    public static void main(String[] args) {
        double saldoAwal = 2500000; // Saldo awal
        double bungaPerBulan = 0.15; // Bunga per bulan (15%)
        int lamaBulan = 6; // Lama dalam bulan

        // Init format nilai ke desimal 
    	NumberFormat formatter = new DecimalFormat("#,###");
        // Menghitung saldo tabungan setiap bulan
        for (int bulan = 1; bulan <= lamaBulan; bulan++) {
            saldoAwal = saldoAwal + (saldoAwal * bungaPerBulan);
            System.out.println("Saldo bulan ke-" + bulan + " Rp." + formatter.format(saldoAwal));
        }
    }
}
