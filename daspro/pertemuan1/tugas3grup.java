public class tugas3grup {
    public static void main(String[] args) {
        int harga_kopi = 30000;
        double diskon = 0.1; // 10% di decimal

        double harga_akhir = harga_kopi - (harga_kopi * diskon);

        System.out.println("harga kopi setelah diskon adalah " + harga_akhir);
    }
}
