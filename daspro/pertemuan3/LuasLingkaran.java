import java.util.Scanner;
public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double phi = 3.14;

        System.out.print("masukan nilai jari-jari = ");
        int r = sc.nextInt();
        double luas = phi * r * r;
        System.out.println("Luas lingkaran = " + luas);
        sc.close();

    }
}
