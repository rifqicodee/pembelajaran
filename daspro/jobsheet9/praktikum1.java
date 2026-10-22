import java.util.Scanner;

/**
 * praktikum1
 */
public class praktikum1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("   Cek Kelulusan   ");
        System.out.println("-------------------");
        System.out.print("masukan nilai anda: ");
        int nilai = input.nextInt();
        if (nilai >= 60) {
            System.out.println("Selamat Anda dinyatakan LULUS");
        } else {
            System.out.println("Maaf Anda dinyatakan TIDAK LULUS");
        }
        input.close();
    }
}
