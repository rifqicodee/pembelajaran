import java.util.Scanner;

/**
 * soal1
 */
public class soal1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---       if else     ---");
        System.out.println("=== Pengiriman Barang ===");
        System.out.println("1. Regular");
        System.out.println("2. Ekspres");
        System.out.println("3. Same Day");
        System.out.print("masukan pilihan (1/2/3): ");
        int tarif = sc.nextInt();
        if (tarif == 1) {
            System.out.println("anda memilih Regular dengan tarif : Rp10.000");
        } else if (tarif == 2) {
            System.out.println("anda memilih Ekspress dengan tarif : Rp20.000");
        } else if (tarif == 3) {
            System.out.println("anda memilih Same Day dengan tarif : Rp30.000");
        } else {
            System.out.println("kode layanan tidak valid");
        }
    }
}
