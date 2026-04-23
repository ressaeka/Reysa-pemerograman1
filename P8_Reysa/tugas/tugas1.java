package src.P8_Reysa.tugas;
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilihan;

        do {
            // Input nilai mahasiswa
            System.out.print("Masukkan nilai mahasiswa: ");
            int nilai = input.nextInt();

            // Menampilkan nilai
            System.out.println("Nilai yang diinput: " + nilai);

            // Pilihan untuk mengulang
            System.out.print("Ingin input lagi? (y/t): ");
            pilihan = input.next().charAt(0);

        } while (pilihan == 'y' || pilihan == 'Y');

        System.out.println("Program selesai.");
    }
}

