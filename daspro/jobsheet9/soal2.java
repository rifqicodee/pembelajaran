import java.util.Scanner;

/**
 * soal2
 */
public class soal2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nama: ");
        String nama = sc.nextLine();

        System.out.print("Masukan NIM : ");
        int nim = sc.nextInt();

        sc.nextLine();

        System.out.print("Masukan kelas: ");
        String kelas = sc.nextLine();

        System.out.print("Masukan nomor absen: ");
        int absen = sc.nextInt();

        System.out.print("Masukan nilai kuis: ");
        double nilai_kuis = sc.nextDouble();

        System.out.print("Masukan nilai tugas: ");
        double nilai_tugas = sc.nextDouble();

        System.out.print("Masukan nilai ujian: ");
        double nilai_ujian = sc.nextDouble();

        double nilai_akhir = (nilai_kuis + nilai_tugas + nilai_ujian) / 3;
        String kualifikasi, nilai_akhir_huruf;

        if (nilai_akhir > 80 && nilai_akhir <= 100) {
            kualifikasi = "Sangat Baik";
            nilai_akhir_huruf = "A";
        } else if (nilai_akhir > 73 && nilai_akhir <= 80) {
            kualifikasi = "Lebih dari Baik";
            nilai_akhir_huruf = "B+";
        } else if (nilai_akhir > 65 && nilai_akhir <= 73) {
            kualifikasi = "Baik";
            nilai_akhir_huruf = "B";
        } else if (nilai_akhir > 60 && nilai_akhir <= 65) {
            kualifikasi = "Lebih dari Cukup";
            nilai_akhir_huruf = "C+";
        } else if (nilai_akhir > 50 && nilai_akhir <= 60) {
            kualifikasi = "Cukup";
            nilai_akhir_huruf = "C";
        } else if (nilai_akhir > 39 && nilai_akhir <= 50) {
            kualifikasi = "Kurang";
            nilai_akhir_huruf = "D";
        } else {
            kualifikasi = "Gagal";
            nilai_akhir_huruf = "E";
        }

        System.out.println(
                "Mahasiswa dengan nama " + nama + " (NIM: " + nim + " ) kelas " + kelas + " nomer absen " + absen);
        System.out.println("Nilai akhir: " + nilai_akhir);
        System.out.println("nilai akhir huruf: " + nilai_akhir_huruf);
        System.out.println("kualifikasi: " + kualifikasi);
        sc.close();

    }
}
