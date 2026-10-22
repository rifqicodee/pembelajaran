import java.util.Scanner;

/**
 * praktikum4
 */
public class praktikum4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("   Klasifikasi Grade Nilai   ");
        System.out.println("-----------------------------");
        System.out.print("masukan nilai Anda: ");
        int nilai = input.nextInt();
        if (nilai >= 90) {
            System.out.println("Grade: A");
        } else if (nilai >= 80) {
            System.out.println("Grade: B");
        } else if (nilai >= 70) {
            System.out.println("Grade: C");
        } else if (nilai >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: E (Tidak Lulus)");
        }
        input.close();
    }
}
