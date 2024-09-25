package Praktikum03;
import java.util.Scanner;

public class Segitiga21 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int alas, tinggi;
        float luas;

        System.out.println("....");
        System.out.print("Masukkan alas ");
        alas = sc.nextInt();
        System.out.print("Masukkan tinggi ");
        tinggi = sc.nextInt();

        luas = alas * tinggi / 2;
        System.out.println("Luas segitiga: " + luas);
    }
}
