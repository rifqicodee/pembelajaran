import java.util.Scanner;

public class soal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 100;
        String[] namaPelanggan = new String[max];
        double[] kwhList = new double[max];
        double[] totalTagihanList = new double[max];
        double[] dendaList = new double[max];

        int jumlahdata = 0;

        String menu = "";
        menu += "\n       MENU         \n\n";
        menu += "1. Input pelanggan baru\n";
        menu += "2. History semua tagihan\n";
        menu += "3. Pendapatan PLN dari denda\n";
        menu += "4. Keluar\n";
        menu += "masukan pilihan mu: ";

        int pilihan;
        do {
            System.out.print(menu);
            pilihan = sc.nextInt();
            while (pilihan < 1 || pilihan > 4) {
                System.out.print("masukan pilihan mu karena tadi tidak valid: ");
                pilihan = sc.nextInt();
            }
            switch (pilihan) {
                case 1:
                    if (jumlahdata >= max) {
                        System.out.println("kapasitas data tidak boleh lebih dari 100");
                        break;
                    }
                    sc.nextLine();
                    System.out.print("Masukan nama pelanggan: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukan pemakaian kwh: ");
                    double kwh = sc.nextDouble();
                    System.out.print("Apakah anda termasuk subsidi(1 = ya , 0 = tidak): ");
                    int isSubsidi = sc.nextInt();
                    System.out.print("Masukan jumlah hai telambat: ");
                    int telat = sc.nextInt();

                    // hitungan dulu cuy
                    double tagihanPokok = 0;
                    double sisakwh = kwh;
                    if (sisakwh > 300) {
                        tagihanPokok += (sisakwh - 300) * 1699;
                        sisakwh = 300;
                    }
                    if (sisakwh > 100) {
                        tagihanPokok += (sisakwh - 100) * 1444;
                        sisakwh = 100;
                    }
                    tagihanPokok += sisakwh * 1352;

                    double potongan = 0;
                    if (isSubsidi == 1) {
                        potongan = tagihanPokok * 0.30;
                    }

                    double denda = 0;
                    if (telat > 0) {
                        int periode = (telat + 9) / 10;
                        double tagihanSebelumDenda = (tagihanPokok - potongan) + 2500;
                        denda = periode * 0.05 * tagihanSebelumDenda;
                    }

                    double totalTagihan = (tagihanPokok - potongan) + 2500 + denda;

                    namaPelanggan[jumlahdata] = nama;
                    kwhList[jumlahdata] = kwh;
                    totalTagihanList[jumlahdata] = totalTagihan;
                    dendaList[jumlahdata] = denda;

                    jumlahdata++;

                    System.out.println("Data berhasil disimpan! Total Tagihan: Rp " + totalTagihan);
                    break;
                case 2:
                    if (jumlahdata == 0) {
                        System.out.println("Belum ada histori transaksi.");
                    } else {
                        System.out.println("\n=== HISTORI TRANSAKSI ===");
                        double totalPendapatan = 0;

                        for (int i = 0; i < jumlahdata; i++) {
                            System.out.println((i + 1) + ". Nama: " + namaPelanggan[i] +
                                    " | kWh: " + kwhList[i] +
                                    " | Total: Rp " + totalTagihanList[i]);
                            totalPendapatan += totalTagihanList[i];
                        }

                        System.out.println("-----------------------------------");
                        System.out.println("Total Pendapatan PLN: Rp " + totalPendapatan);
                    }
                    break;
                case 3:
                    if (jumlahdata == 0) {
                        System.out.println("Belum ada histori transaksi.");
                    } else {
                        System.out.println("\n=== REKAP PENDAPATAN DENDA PLN ===");
                        double totalDendaPLN = 0;

                        for (int i = 0; i < jumlahdata; i++) {
                            System.out.println((i + 1) + ". Nama: " + namaPelanggan[i] +
                                    " | Denda: Rp " + dendaList[i]);
                            totalDendaPLN += dendaList[i];
                        }

                        System.out.println("-----------------------------------");
                        System.out.println("Total Pendapatan PLN dari Denda: Rp " + totalDendaPLN);
                    }
                    break;
                case 4:
                    System.out.println("terima kasih!");
                    break;
            }
            System.out.println();

        } while (pilihan != 4);

    }
}
