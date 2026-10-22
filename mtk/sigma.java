/**
 * sigma
 */
public class sigma {

    public static void main(String[] args) {
        // soal 1
        double hasil1 = 0;
        for (int i = 1; i <= 4; i++) {
            hasil1 += Math.pow(i, 2);
        }
        System.out.println("hasil dari soal 1 adalah = " + hasil1);

        // soal 2
        double hasil2 = 0;
        for (int k = 2; k <= 6; k++) {
            hasil2 += 2 * k + 1;
        }
        System.out.println("hasil dari soal 2 adalah = " + hasil2);

        // soal 3
        double hasil3 = 0;
        for (int i = 1; i <= 4; i++) {
            hasil3 += 1.0 / i;
        }
        System.out.println("hasil dari soal 3 adalah = " + hasil3);
    }
}
