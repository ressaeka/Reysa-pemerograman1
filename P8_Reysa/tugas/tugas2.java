package src.P8_Reysa.tugas;
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai;
        int total = 0;
        char ulang;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            nilai = input.nextInt();

            total += nilai;

            System.out.print("Tambah nilai lagi? (y/t): ");
            ulang = input.next().charAt(0);

            System.out.println("----------------------");

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("\nTotal semua nilai mahasiswa: " + total);
        System.out.println("Program selesai.");
    }
}