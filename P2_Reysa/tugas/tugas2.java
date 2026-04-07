package src.P2_Reysa.tugas;
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nama; 
        int usia;
        
        System.out.print("Input nama : ");
        nama = input.nextLine();
        
        System.out.print("Input usia : ");
        usia = input.nextInt();
        
        System.out.println(" Nama saya adalah " + nama + " dan Usia saya " + usia + " tahun");
    }
}