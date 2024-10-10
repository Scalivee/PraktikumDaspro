package Praktikum06;

import java.util.Scanner;

public class Pemilihan2Percobaan221 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        double diskon = 0, harga = 0;
        double totalBayar;
        int potonganQris = 1000;

        System.out.println("...");
        System.out.println("--------------------------------");
        System.out.println("========MENU KAFE JTI========");
        System.out.println("--------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice tea)");
        System.out.println("---------------------------------------");
        System.out.print("Masukkan Angka Menu Pilihan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Apakah punya member (y/n) ? = ");
        String member = sc.next();
        System.out.println("---------------------------------------");
        

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl: " + harga );

            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea: " + harga);

            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga bundling: " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
        } 

    }

        else if (member.equalsIgnoreCase("n")) {
            diskon = 0;
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl: " + harga);

            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea: " + harga);

            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga bundling: " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            System.out.println("Total bayar: " + harga);

        } else {
            System.out.println("Member tidak valid");

    }

        totalBayar = harga - (harga * diskon);
        System.out.println("Total bayar setelah diskon: " + totalBayar);

        System.out.print("Jenis Pembayaran: ");
        String jenisPembayaran = sc.next();
        System.out.println("---------------------------------------");

        if (jenisPembayaran.equalsIgnoreCase("QRIS")) {
            totalBayar -= potonganQris;
            System.out.println("Potongan QRIS sebesar Rp. 1.000 diterapkan.");
       
            System.out.println("Total bayar setelah diskon dan potongan: " + totalBayar);
            System.out.println("---------------------------------------");
       
       }        

        
}
}
