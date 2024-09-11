import java.util.Scanner;

public class Perusahaan {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan jumlah jam kerja: ");
    int jumlahJamKerja = sc.nextInt();

    System.out.print("Masukkan upah per jam: ");
    double upahPerJam = sc.nextDouble();

    double gajiPokok = jumlahJamKerja * upahPerJam;
    double bonus = gajiPokok * 0.1;
    double gajiKotor = gajiPokok + bonus;
    double pajak = gajiKotor * 0.05;
    double gajiBersih = gajiKotor - pajak;

    System.out.println("Gaji bersih karyawan: Rp " + gajiBersih);

    }
}