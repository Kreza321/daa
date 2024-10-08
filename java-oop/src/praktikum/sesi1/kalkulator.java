package praktikum.sesi1;

import java.util.Scanner; // Import harus berada di luar deklarasi kelas

public class kalkulator {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        int pilihan;
        boolean lanjut = true; // Variabel untuk mengontrol loop

        while (lanjut) {
            // Menampilkan menu operasi
            System.out.println("\nPILIH OPERASI: ");
            System.out.println("1. PENJUMLAHAN");
            System.out.println("2. PENGURANGAN");
            System.out.println("3. PEMBAGIAN");
            System.out.println("4. PERKALIAN");
            System.out.println("5. KELUAR");
            System.out.print("MASUKKAN PILIHAN (1/2/3/4/5): ");
            pilihan = input.nextInt();

            // Memeriksa apakah pengguna ingin keluar
            if (pilihan == 5) {
                System.out.println("TERIMA KASIH! PROGRAM DIHENTIKAN.");
                lanjut = false; // Mengubah kondisi loop menjadi false
                continue; // Melanjutkan ke iterasi berikutnya
            }

            // Meminta input bilangan berdasarkan pilihan
            System.out.print("MASUKKAN BILANGAN 1: ");
            double bilangan1 = input.nextDouble();
            System.out.print("MASUKKAN BILANGAN 2: ");
            double bilangan2 = input.nextDouble();
            double hasil;

            // Melakukan operasi berdasarkan pilihan pengguna
            switch (pilihan) {
                case 1:
                    hasil = bilangan1 + bilangan2;
                    System.out.println("HASIL PENJUMLAHAN: " + bilangan1 + " + " + bilangan2 + " = " + hasil);
                    break;
                case 2:
                    hasil = bilangan1 - bilangan2;
                    System.out.println("HASIL PENGURANGAN: " + bilangan1 + " - " + bilangan2 + " = " + hasil);
                    break;
                case 3:
                    if (bilangan2 != 0) {
                        hasil = bilangan1 / bilangan2;
                        System.out.println("HASIL PEMBAGIAN: " + bilangan1 + " / " + bilangan2 + " = " + hasil);
                    } else {
                        System.out.println("ERROR: PEMBAGIAN DENGAN NOL TIDAK DIPERBOLEHKAN.");
                    }
                    break;
                case 4:
                    hasil = bilangan1 * bilangan2;
                    System.out.println("HASIL PERKALIAN: " + bilangan1 + " * " + bilangan2 + " = " + hasil);
                    break;
                default:
                    System.out.println("PILIHAN TIDAK VALID. SILAHKAN COBA LAGI.");
                    break;
            }
        }

        // Menutup Scanner
        input.close();
    }
}
