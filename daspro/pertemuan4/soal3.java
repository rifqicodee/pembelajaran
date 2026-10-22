
/**
 * soal3
 */
import java.util.Scanner;

public class soal3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukan nilai tugas = ");
        int nilai_tugas = sc.nextInt();
        System.out.print("masukan nilai uts = ");
        int nilai_uts = sc.nextInt();
        System.out.print("masukan nilai uas = ");
        int nilai_uas = sc.nextInt();
        double nilai_akhir = (0.3 * nilai_tugas) + (0.3 * nilai_uts) + (0.4 * nilai_uas);
        sc.close();

        System.out.print("nilai akhir kamu adalah = " + nilai_akhir);

    }
}
