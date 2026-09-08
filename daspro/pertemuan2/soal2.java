/**
 * soal2
 */
public class soal2 {

    public static void main(String[] args) {

        int tanah_kosong = 10 * 20;
        int kos = 5 * 4;
        int teras = 5 * 1;

        int bisa_dibangun = tanah_kosong / (kos + teras);
        int sisa_tanah = tanah_kosong % (kos + teras);
        System.out.println("yang bisa dibangun adalah = " + bisa_dibangun);
        System.out.println("sisa tanah yang tersedia adalah " + sisa_tanah);

    }
}
