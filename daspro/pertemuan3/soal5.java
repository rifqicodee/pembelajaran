
/**
 * soal4
 */
import java.util.Scanner;

public class soal5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan nilai total belanja anda dalam Rupiah = ");
        double total_belanja = sc.nextDouble();

        System.out.print("masukan nominal uang yang dibayar dalam Rupiah = ");
        int nominal = sc.nextInt();
        sc.close();

        System.out.println("nilai belanja anda adalah Rp. " + total_belanja);

        double diskon = (10.0 / 100) * total_belanja;
        total_belanja -= diskon;

        System.out.println("diskon yang didapat adalah Rp. " + diskon);
        System.out.println("jadi nilai total belanja nya adalah Rp. " + total_belanja);
        System.out.println("nilai nominal yang dibayar Rp. " + nominal);
        double kembalian = nominal - total_belanja;
        System.out.println("jadi untuk kembalian nya adalah Rp. " + kembalian);
    }
}
