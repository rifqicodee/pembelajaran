
/**
 * soal1
 */
import java.util.Scanner;

public class soal1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukan nilai sisi dari persegi = ");
        double s = sc.nextDouble();
        double r = s / 2;
        double phi = 3.14;
        double luas_persegi = s * s;
        double luas_lingkaran = phi * r * r;
        double lahan_sisa = luas_persegi - luas_lingkaran;
        sc.close();
        System.out.println("luas persegi adalah \t= " + luas_persegi);
        System.out.println("luas lingkaran adalah \t= " + luas_lingkaran);
        System.out.println("luas yang tidak ditanami = " + lahan_sisa);

    }
}
