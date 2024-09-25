package Praktikum03;
import java.util.Scanner;

public class Listik21 {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        java.util.Scanner sc = new Scanner(System.in);
    

        double tarifListrik, penggunaanListrik, tagihan, listrikLebih;

        listrikLebih = 500;
        tarifListrik = 1500;

        System.out.println("...");
        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");
        penggunaanListrik = sc.nextDouble();

        tagihan = penggunaanListrik * tarifListrik;
        System.out.println("Tagihan listrik anda adalah: " + tagihan);

        System.out.println("Apakah listrik lebih dari 500kWh?: " + (listrikLebih < penggunaanListrik)) ;
    }
    
}
