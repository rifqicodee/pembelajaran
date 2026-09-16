
/**
 * soal3
 */
import java.util.Scanner;

public class soal3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan nilai jarak dalam bentuk km = ");
        int jarak = sc.nextInt();
        System.out.print("masukan nilai kecepatan dalam bentuk km/jam = ");
        int kecepatan = sc.nextInt();
        int waktu = jarak / kecepatan;
        System.out.println("nilai jarak yang diinput = " + jarak + " km");
        System.out.println("nilai kecepatan yang diinput = " + kecepatan + " km/jam");
        System.out.println("waktu yang ditempuh adalah = " + waktu + " jam");
        sc.close();

    }
}
