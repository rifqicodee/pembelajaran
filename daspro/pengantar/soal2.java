import java.util.Scanner;

/**
 * soal2
 */
public class soal2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_belanja = 100000;
        double total_bayar;
        System.out.println("---   if else   ---");
        System.out.println("total sebelum diskon : " + total_belanja);
        System.out.println("kode Anggota");
        System.out.println("1. regular (5%)");
        System.out.println("2. member  (10%)");
        System.out.println("3. premium (15%)");
        System.out.print("masukan kode anggota (1/2/3):");
        int anggota = sc.nextInt();
        if (anggota == 1) {
            total_bayar = total_belanja * (1 - 0.05);
            System.out.println("kamu mendapatkan diskon 5% jadi kamu membayar " + total_bayar);
        } else if (anggota == 2) {
            total_bayar = total_belanja * (1 - 0.10);
            System.out.println("kamu mendapatkan diskon 10% jadi kamu membayar " + total_bayar);
        } else if (anggota == 3) {
            total_bayar = total_belanja * (1 - 0.15);
            System.out.println("kamu mendapatkan diskon 15% jadi kamu membayar " + total_bayar);
        } else {
            System.out.println("input tidak valid");
        }
    }
}
