public class soal4 {
    public static void main(String[] args) {
        int jumlahRupiah = 18000;
        int jumlahUSD = 1;

        double RpToUSD = jumlahRupiah / 18000.0;
        double USDToRp = jumlahUSD * 18000.0;
        double RpToSGD = jumlahRupiah / (18000.0 /1.3);

        System.out.println("uang Rp. " + jumlahRupiah + " di konversi menjadi USD " + RpToUSD);
        System.out.println("uang " + jumlahUSD + " USD di konversi menjadi Rp. " + USDToRp);
        System.out.println("uang Rp. " + jumlahRupiah + " di konversi menjadi SGD " + RpToSGD);


    }
}
