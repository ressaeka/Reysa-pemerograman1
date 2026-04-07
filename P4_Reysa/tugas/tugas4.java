package src.P4_Reysa.tugas;
import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ===== SENIN =====
        System.out.println("==== SENIN ====");
        System.out.print("Input Uang Makan      : ");
        int makanSenin = input.nextInt();
        System.out.print("Input Uang Transport  : ");
        int transportSenin = input.nextInt();
        System.out.print("Input Uang Belanja    : ");
        int belanjaSenin = input.nextInt();

        // ===== SELASA =====
        System.out.println("==== SELASA ====");
        System.out.print("Input Uang Makan      : ");
        int makanSelasa = input.nextInt();
        System.out.print("Input Uang Transport  : ");
        int transportSelasa = input.nextInt();
        System.out.print("Input Uang Belanja    : ");
        int belanjaSelasa = input.nextInt();

        // ===== RABU =====
        System.out.println("==== RABU ====");
        System.out.print("Input Uang Makan      : ");
        int makanRabu = input.nextInt();
        System.out.print("Input Uang Transport  : ");
        int transportRabu = input.nextInt();
        System.out.print("Input Uang Belanja    : ");
        int belanjaRabu = input.nextInt();

        // ===== KAMIS =====
        System.out.println("==== KAMIS ====");
        System.out.print("Input Uang Makan      : ");
        int makanKamis = input.nextInt();
        System.out.print("Input Uang Transport  : ");
        int transportKamis = input.nextInt();
        System.out.print("Input Uang Belanja    : ");
        int belanjaKamis = input.nextInt();


        // ===== JUMAT =====
        System.out.println("==== JUMAT ====");
        System.out.print("Input Uang Makan      : ");
        int makanJumat = input.nextInt();
        System.out.print("Input Uang Transport  : ");
        int transportJumat = input.nextInt();
        System.out.print("Input Uang Belanja    : ");
        int belanjaJumat = input.nextInt();
        
        // ==== SABTU ====
        System.out.println("==== SABTU ====");
        System.out.print("Input Uang Makan      : ");
        int makanSabtu = input.nextInt();
        System.out.print("Input Uang Transport  : ");
        int transportSabtu = input.nextInt();
        System.out.print("Input Uang Belanja    : ");
        int belanjaSabtu = input.nextInt();

        // ==== MINGGU ====
        System.out.println("==== MINGGU ====");
        System.out.print("Input Uang Makan      : ");
        int makanMinggu = input.nextInt();
        System.out.print("Input Uang Transport  : ");
        int transportMinggu = input.nextInt();
        System.out.print("Input Uang Belanja    : ");
        int belanjaMinggu = input.nextInt();



        // ===== TOTAL =====
        double totalMakan = makanSenin + makanSelasa + makanRabu + makanKamis + makanJumat + makanSabtu + makanMinggu;
        double totalTransport = transportSenin + transportSelasa + transportRabu + transportKamis + transportJumat + transportSabtu + transportMinggu;
        double totalBelanja = belanjaSenin + belanjaSelasa + belanjaRabu + belanjaKamis + belanjaJumat + belanjaSabtu + belanjaMinggu;

        double totalPengeluaran = totalMakan + totalTransport + totalBelanja;

        double persenMakan = (totalMakan / totalPengeluaran) * 100;
        double persenTransport = (totalTransport / totalPengeluaran) * 100;
        double persenBelanja = (totalBelanja / totalPengeluaran) * 100;

        // ===== OUTPUT =====
        System.out.println("==========");
        System.out.printf("Total Pengeluaran     : Rp %.0f\n", totalPengeluaran);
        System.out.printf("Persentase Makan      : %.2f%%\n", persenMakan);
        System.out.printf("Persentase Transport  : %.2f%%\n", persenTransport);
        System.out.printf("Persentase Belanja    : %.2f%%\n", persenBelanja);
        System.out.printf("Total Persentase      : %.2f%%\n", persenMakan + persenTransport + persenBelanja);
        System.out.println("==========");

        input.close();
    }
}