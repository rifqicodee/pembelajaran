import java.util.Scanner;

/**
 * praktikum5
 */
public class praktikum5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("     Prediksi Nilai");
        System.out.println("-------------------------");
        System.out.print("masukan nilai anda (bilangan bulat / desimal) = ");
        float nilai = input.nextFloat();

        if ((nilai >= 80) && (nilai <= 100)) {
            System.out.println("Predikat Nilai " + nilai + " = A");
        } else if ((nilai >= 60) && (nilai < 80)) {
            System.out.println(("Predikat Nilai " + nilai + " = B"));
        } else if ((nilai >= 50) && (nilai < 60)) {
            System.out.println("Predikat Nilai " + nilai + " = C");
        } else if ((nilai >= 30) && (nilai < 50)) {
            System.out.println("Predikat Nilai " + nilai + " = D");
        } else if (nilai < 29) {
            System.out.println("Predikat Nilai " + nilai + " = E");
        } else {
            System.out.println("inputan nilai salah !");
        }
        System.out.println("");
        input.close();
    }
}
