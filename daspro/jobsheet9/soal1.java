import java.util.Scanner;

/**
 * soal1
 */
public class soal1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("apakah kamu member kafe ini (y/n) : ");
        String member = sc.nextLine().toLowerCase();

        System.out.println("======= menu ========");
        System.out.println("1. kopi ");
        System.out.println("2. teh ");
        System.out.println("3. cokelat");

        System.out.print("masukan nama menu yang anda pilih: ");
        String menu = sc.nextLine();

        System.out.print("kamu ingin memesan " + menu + " berapa: ");
        int jumlah = sc.nextInt();

        sc.nextLine();

        System.out.print("masukan ukuran cup (S/M/L): ");
        String cup = sc.nextLine();

        double hargaMenu = 0;
        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "cokelat":
                hargaMenu = 20000;
                break;
            default:
                System.out.println("menu yang anda masukan tidak ada di dalam menu");
                break;
        }

        double totalHarga = hargaMenu * jumlah;

        switch (cup.toUpperCase()) {
            case "S":
                break;
            case "M":
                totalHarga += 0.25 * totalHarga;
                break;
            case "L":
                totalHarga += 0.4 * totalHarga;
                break;
            default:
                System.out.println("inputan tidak valid");
                break;
        }
        double diskon = member.equals("y") ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + cup);
        System.out.println("Nominal Bayar: " + nominalBayar);
        sc.close();
    }
}
