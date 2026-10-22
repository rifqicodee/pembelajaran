import java.util.Scanner;

/**
 * praktikum2
 */
public class praktikum2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan sebuah angka = ");
        int bilangan = input.nextInt();
        int cek = bilangan % 2;

        if (cek == 0) {
            System.out.println(bilangan + " adalah bilangan Genap");
        } else {
            System.out.println(bilangan + " adalah bilangan Ganjil");
        }
        input.close();
    }
}
