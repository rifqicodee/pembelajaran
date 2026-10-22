import java.util.Scanner;

/**
 * soal2
 */
public class soal2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan nilai dalam satuan pcs: ");
        int pcs = sc.nextInt();
        double hasil = pcs / 12.0;
        sc.close();

        System.out.println("nilai yang kamu masukan adalah: " + pcs + " pcs");
        System.out.println("konversi ke lusin\t: " + hasil + " lusin");
    }
}
