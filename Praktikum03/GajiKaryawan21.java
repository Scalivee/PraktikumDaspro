package Praktikum03;
import java.util.Scanner;

public class GajiKaryawan21 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("...");
        System.out.print("Masukkan jumlah jam kerja: ");
        int jamKerja = sc.nextInt();
        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = sc.nextDouble();

        double gajiPokok = jamKerja * upahPerJam;
        double bonus = gajiPokok * 0.1;
        double totalGajiSebelumPajak = gajiPokok + bonus;
        double pajak = totalGajiSebelumPajak * 0.05;
        double gajiBersih = totalGajiSebelumPajak - pajak;

        System.out.println("Gaji pokok: Rp " + gajiPokok);
        System.out.println("Bonus: Rp " + bonus);
        System.out.println("Total gaji sebelum pajak: Rp " + totalGajiSebelumPajak);
        System.out.println("Pajak: Rp " + pajak);
        System.out.println("Gaji bersih: Rp " + gajiBersih);
    }
}
