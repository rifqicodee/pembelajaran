import java.util.Scanner;

public class soal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga_buku = 5000;
        int harga_bulpoin = 2000;
        int harga_tipex = 3000;
        System.out.print("masukan jumlah buku : ");
        int buku = sc.nextInt();
        System.out.print("masukan jumlah bulpoin : ");
        int bulpoin = sc.nextInt();
        System.out.print("masukan jumlah tipex : ");
        int tipex = sc.nextInt();
        int jumlah_harga_buku = buku * harga_buku;
        int jumlah_harga_bulpoin = bulpoin * harga_bulpoin;
        int jumlah_harga_tipex = tipex * harga_tipex;
        int total = (buku * harga_buku) + (bulpoin * harga_bulpoin) + (tipex * harga_tipex);
        double diskon = total * 0.1;
        double total_bayar = total - diskon;
        System.out.println("jumlah harga buku : " + jumlah_harga_buku);
        System.out.println("jumlah harga bulpoin : " + jumlah_harga_bulpoin);
        System.out.println("jumlah harga tipex : " + jumlah_harga_tipex);
        System.out.println("total bayar : " + total_bayar);
        sc.close();
    }
}
