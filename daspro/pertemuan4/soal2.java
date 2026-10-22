
/**
 * soal2
 */
import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan jarak yang ditempuh = ");
        double jarak = sc.nextDouble();
        int konsumsi_bbm = 2;
        int harga_bensin = 10000;

        double biaya_bensin = jarak / konsumsi_bbm * harga_bensin;

        System.out.println("jadi biaya bensin yang kamu buthkan adalah = " + biaya_bensin);

        sc.close();
    }
}
