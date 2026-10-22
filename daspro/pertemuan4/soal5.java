
/**
 * soal5
 */
import java.util.Scanner;

public class soal5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("jumlah tiket yang mau dibeli = ");
        int jumlah_beli = sc.nextInt();
        System.out.print("harga tiket = ");
        int harga_tiket_bioskop = sc.nextInt();
        System.out.print("biaya layanan = ");
        int biaya_layanan = sc.nextInt();
        int total_bayar = (harga_tiket_bioskop * jumlah_beli) + biaya_layanan;
        sc.close();
        System.out.print("total yang anda bayar adalah = " + total_bayar);

    }
}
