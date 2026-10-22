import java.util.Scanner;

/**
 * soal1
 */
public class soal1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan nilai panjang: ");
        int panjang = sc.nextInt();
        System.out.print("masukan nilai lebar: ");
        int lebar = sc.nextInt();
        int luas = panjang * lebar;
        int keliling = 2 * (panjang + lebar);
        sc.close();

        System.out.println("nilai luas meja adalah\t: " + luas);
        System.out.println("nilai keliling meja adalah\t: " + keliling);
    }
}
