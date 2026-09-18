/**
 * mtk1
 */
public class mtk1 {

    public static void main(String[] args) {
        // soal 1
        int n = 3;
        int hasil1 = (int) Math.pow(2, n);
        System.out.println("Hasil Pangkat (Kapasitas Memori)\t: " + hasil1);

        // soal2
        double x1 = 6, y1 = 8, x2 = 0, y2 = 0;
        double dx = x2 - x1;
        double dy = y2 - y1;

        double hasil2 = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        System.out.println("Hasil akar (Jarak Koordinat)\t\t: " + hasil2);

        // soal3
        double sensor = 150.75;
        double nilai_asli = 150.70;

        double selisih = Math.abs(sensor - nilai_asli);
        System.out.printf("Hasil Nilai Mutlak (Selisih)\t\t: %.2f\n", selisih);

        // soal4
        int antrean = 43;
        int hasil4 = antrean % hasil1;
        System.out.println("Hasil Modulo (Posisi Indeks)\t\t: " + hasil4);

    }
}
