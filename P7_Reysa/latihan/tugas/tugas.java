package src.P7_Reysa.latihan.tugas;
import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TAMPILIN MENU
        System.out.println("====================================");
        System.out.println("Menu Makanan");
        System.out.println("====================================");
        System.out.println("1. Bakso        : Rp.12000");
        System.out.println("2. Mie ayam     : Rp.13000");
        System.out.println("3. Kwetiau      : Rp.14000");
        System.out.println("4. Nasi Goreng  : Rp.15000");

        System.out.print("Masukan pilihan (1-4): ");
        String pilihan = input.nextLine();

        // VALIDASI 
        if (pilihan.equals("1") || pilihan.equals("2") || 
            pilihan.equals("3") || pilihan.equals("4")) {

            String namaMenu = "";
            int harga = 0;

            // SWITCH
            switch (pilihan) {
                case "1":
                    namaMenu = "Bakso";
                    harga = 12000;
                    break;
                case "2":
                    namaMenu = "Mie ayam";
                    harga = 13000;
                    break;
                case "3":
                    namaMenu = "Kwetiau";
                    harga = 14000;
                    break;
                case "4":
                    namaMenu = "Nasi Goreng";
                    harga = 15000;
                    break;
            }

            // INPUT USER
            System.out.print("Masukan Nama   : ");
            String nama = input.nextLine();

            System.out.print("Jumlah Pesanan : ");
            int jumlah = input.nextInt();

            int total = harga * jumlah;

            System.out.println("\n====================================");
            System.out.println("Nota Pembelian");
            System.out.println("====================================");
            System.out.println("Nama    : " + nama);
            System.out.println("Menu    : " + namaMenu);
            System.out.println("Harga   : Rp." + harga);
            System.out.println("Jumlah  : " + jumlah);
            System.out.println("------------------------------------");
            System.out.println("Total   : Rp." + total);
            System.out.println("====================================");

        } else {
            System.out.println("Pilihan tidak tersedia");
        }

        input.close();
    }
}