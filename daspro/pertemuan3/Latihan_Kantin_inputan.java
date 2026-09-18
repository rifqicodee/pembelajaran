/**
 * Latihan_Kantin_inputan
 */
import java.util.Scanner;
public class Latihan_Kantin_inputan {

    public static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println("Kasir Kantin Polinema PSDKU Lumajang");
        System.out.println("------------------------------------");
        Scanner sc = new Scanner(System.in);


        System.out.print("masukan nama pembeli = " );
        String nama = sc.nextLine();
        System.out.print("masukan jumlah ayam geprek = ");
        int jumlah_ayam_geprek = sc.nextInt();
        System.out.print("masukan jumlah beli  es teh = ");
        int jumlah_es_teh = sc.nextInt();
        int harga_ayam_geprek = 8000;
        int harga_es_teh = 3000;
        int total_bayar = (jumlah_ayam_geprek * harga_ayam_geprek) + (jumlah_es_teh * harga_es_teh);
        System.out.println("--------------------------------------");
        sc.close();
        System.out.println("Total bayar " + nama + " = " + total_bayar);
        

    }
}