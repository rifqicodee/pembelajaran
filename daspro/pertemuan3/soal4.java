
/**
 * soal4
 */
import java.util.Scanner;

public class soal4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan nilai total belanja anda dalam Rupiah = ");
        int total_belanja = sc.nextInt();
        System.out.print("masukan nominal uang yang dibayar dalam Rupiah = ");
        int nominal = sc.nextInt();
        sc.close();
        int kembalian = nominal - total_belanja;
        System.out.println("nilai belanja anda adalah Rp. " + total_belanja);
        System.out.println("nilai nominal yang dibayar Rp. " + nominal);
        System.out.println("jadi untuk kembalian nya adalah Rp. " + kembalian);
    }
}
