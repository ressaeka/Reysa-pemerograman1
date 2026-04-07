package src.P4_Reysa.latihan;
import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("=".repeat(10));
        System.out.print("Input Kehadiran  :");
        int Kehadiran = input.nextInt();
        System.out.print("Input Tugas      :");
        int Tugas = input.nextInt();
        System.out.print("Input Uts        :");
        int Uts = input.nextInt();
        System.out.print("Input Uas        :");
        int Uas = input.nextInt();
        int realisasi = 21;
        System.out.println("=".repeat(10));


        double bKehadiran = ((double) Kehadiran / realisasi) * 10 / 100;
        double bTugas = (double) Tugas * 20 / 100;
        double bUts = (double) Uts * 30 / 100;
        double bUas = (double) Uas * 40 / 100;
        double total = bKehadiran + bTugas + bUts + bUas;


        System.out.println("Bobot Kehadiran :" + bKehadiran);
        System.out.println("Bobot Tugas     :" + bTugas);
        System.out.println("Bobot Uts       :" + bUts);
        System.out.println("Bobot Uas       :" + bUas);
        System.out.println("Total           :" + total);








    }
    
}
