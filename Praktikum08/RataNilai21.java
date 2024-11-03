package Praktikum08;

import java.util.Scanner;

public class RataNilai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("...");
        int i = 1;
        while (i <= 5) {
            float totalNilai = 0;
            System.out.println("Input nilai mahasiswa ke-" + i);
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                int nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }
            float rataNilai = totalNilai / 5;
            i++;
            System.out.println("Rata-rata nilai mahasiswa ke- " + i + " adalah " + rataNilai);
        }
        sc.close();
    }
}
