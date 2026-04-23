package src.P8_Reysa.Latihan;
import java.util.Scanner;   

public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            System.out.println("\n--- DATA ---");
            System.out.println("Nama : " + nama);
            System.out.println("NIM  : " + nim);

            System.out.print("\nUlangi input? (y/t): ");
            ulang = input.next().charAt(0);
            input.nextLine();

        } while (ulang == 'y' || ulang == 'Y' ); 

        System.out.println("Program selesai.");
    }
}

