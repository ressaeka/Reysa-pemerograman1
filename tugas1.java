package src.tugas;

public class tugas1 {
    public static void main(String[] args) {
        int makan = 20000;
        int transport = 10000;
        int belanja = 50000;
        double total = makan + transport + belanja;
        
        double bMakan = ((double) makan / total) * 100;
        double bTransport = ((double) transport / total) * 100;
        double bBelanja = ((double) belanja / total) * 100;
        double totalAll = bMakan + bTransport + bBelanja;

        System.out.println("Total pengeluaran: Rp " + total);
        System.out.println("Persentase Makan: " + bMakan + "%");
        System.out.println("Persentase Transport: " + bTransport + "%");
        System.out.println("Persentase Belanja: " + bBelanja + "%");
        System.out.println("Total persentase: " + totalAll + "%");
    }
}