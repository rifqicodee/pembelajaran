public class soal7 {
    public static void main(String[] args) {
        int jam = 2;
        int bayar = 0;
        if (jam <= 2) {
            bayar = 2000;
        } else if (jam > 2) {
            bayar = 2000 + (jam - 2) * 1000;
        }

        System.out.println("total bayar anda adalah " + bayar);
    }
}
