
/**
 * soal4
 */
import java.util.Scanner;

public class soal4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan nilai rupiah = ");
        double rupiah = sc.nextDouble();
        double dollar = 18000;
        double konversi_dollar = rupiah / dollar;
        sc.close();

        System.out.print("dikonversi ke dollar jadi nya = " + konversi_dollar);

    }
}
