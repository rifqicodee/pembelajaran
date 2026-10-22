import java.util.Scanner;

public class MinimarketNusantara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalBelanja = 75000;
        int kesempatan = 3;

        System.out.println("Total Belanja: Rp" + totalBelanja);

        while (kesempatan > 0) {
            // 1. Program meminta input pembayaran
            System.out.print("\nMasukkan uang pembayaran: Rp. ");
            
            // Validasi agar program tidak error jika input bukan angka
            if (!input.hasNextInt()) {
                System.out.println("Input tidak valid! Harap masukkan angka.");
                input.next(); // Membersihkan input yang salah
                continue; 
            }
            
            int uang = input.nextInt();

            // 5. Jika nominal tidak valid (nol, negatif, atau bukan kelipatan Rp1.000)
            if (uang <= 0 || uang % 1000 != 0) {
                System.out.println("Nominal tidak valid! Harap masukkan angka kelipatan Rp1.000.");
                continue; // Kesempatan tidak berkurang, kembali ke awal perulangan
            }

            // 2. Jika uang cukup (sama dengan atau lebih dari total belanja)
            if (uang >= totalBelanja) {
                int kembalian = uang - totalBelanja;
                System.out.println("Pembayaran Berhasil! Kembalian: Rp. " + kembalian);
                break; // Hentikan perulangan
            } 
            // 3. Jika uang kurang
            else {
                int kurang = totalBelanja - uang;
                kesempatan--;
                System.out.println("Uang Kurang Rp " + kurang + "! Sisa kesempatan: " + kesempatan);
            }
        }

        // 4. Jika kesempatan habis
        if (kesempatan == 0) {
            System.out.println("Transaksi dibatalkan!");
        }

        input.close();
    }
}