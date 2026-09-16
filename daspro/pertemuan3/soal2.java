
/**
 * soal2
 */
import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan harga hardisk nya = ");
        int harga_hardisk = sc.nextInt();
        double diskon = (5.0 / 100.0) * harga_hardisk;
        double total_pembayaran = harga_hardisk - diskon;
        sc.close();

        System.out.println("nilai hardisk yang kamu input adalah " + harga_hardisk);
        System.out.println("diskon nya adalah " + diskon);
        System.out.println("total pembayaran = " + total_pembayaran);
    }
}
