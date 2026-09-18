
/**
 * soal1
 */
import java.util.Scanner;

public class soal1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan variabel a = ");
        int a = sc.nextInt();

        System.out.print("masukan variabel b = ");
        int b = sc.nextInt();

        System.out.print("masukan variabel c = ");
        int c = sc.nextInt();

        int x = 2 * a * a + (a * b) + c;
        System.out.println("nilai a yang kamu masukan = " + a);
        System.out.println("nilai b yang kamu masukan = " + b);
        System.out.println("nilai c yang kamu masukan = " + c);
        System.out.println("hasil perhitungan dari x = 2a^2 + ab + c");
        System.out.println("hasil x = " + x);
        sc.close();

    }
}
