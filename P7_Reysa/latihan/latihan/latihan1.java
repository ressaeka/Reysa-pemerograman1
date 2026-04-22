package src.P7_Reysa.latihan.latihan;
import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // INPUT DATA USER
        System.out.print("Masukan Nama    : ");
        String inputNama = input.nextLine();

        System.out.print("Masukan Jurusan : ");
        String inputJurusan = input.nextLine();

        // trim() : hapus spasi depan belakang
        // isEmpty() : cek apakah kosong
        if (!inputNama.trim().isEmpty() && !inputJurusan.trim().isEmpty()) {

            // TAMPILKAN PILIHAN KELAS
            System.out.println("1.(REG A)");
            System.out.println("2.(REG B)");
            System.out.println("3.(REG CK)");
            System.out.println("4.(REG CS)");

            System.out.print("Masukan pilihan (1-4): ");
            String pilihan = input.nextLine();

            String kelas = "";

            // MENENTUKAN KELAS BERDASARKAN PILIHAN
            switch (pilihan.toLowerCase()) {
                case "1":
                    kelas = "REG A";
                    break;
                case "2":
                    kelas = "REG B";
                    break;
                case "3":
                    kelas = "REG CK";
                    break;
                case "4":
                    kelas = "REG CS";
                    break;
                default:
                    kelas = "Tidak valid";
            }

            // OUTPUT DATA
            System.out.println("\n====================================");
            System.out.println("Data Mahasiswa");
            System.out.println("====================================");
            System.out.println("Nama    : " + inputNama);
            System.out.println("Jurusan : " + inputJurusan);
            System.out.println("Kelas   : " + kelas);
            System.out.println("====================================");

        } else {
            // JIKA INPUT KOSONG
            System.out.println("Nama atau Jurusan tidak boleh kosong");
        }

        // TUTUP SCANNER
        input.close();
    }
}