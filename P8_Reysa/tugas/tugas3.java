package src.P8_Reysa.tugas;
import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai;
        int total = 0;
        int jumlah = 0;
        char ulang;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            nilai = input.nextInt();

            total += nilai;
            jumlah++;

            System.out.print("Input nilai lagi? (y/t): ");
            ulang = input.next().charAt(0);

            System.out.println("----------------------");

        } while (ulang == 'y' || ulang == 'Y');

        double rataRata = (double) total / jumlah;

        System.out.println("\nJumlah nilai: " + total);
        System.out.println("Jumlah mahasiswa: " + jumlah);
        System.out.println("Rata-rata nilai: " + rataRata);

        System.out.println("Program selesai.");
    }
}