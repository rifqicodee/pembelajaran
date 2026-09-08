public class tugas5grup {
    public static void main(String[] args) {
        int mie = 1;
        int telur = 2;
        int air = 3;

        int harga_mie = 4000;
        int harga_telur = 2000;
        int harga_air = 3000;

        int uang_membayar = 50000;

        int total = (mie * harga_mie) + (telur * harga_telur) + (air * harga_air);

        int uang_kembali = uang_membayar - total;

        System.out.println("Harga Mie   " + harga_mie + "   x" +mie);
        System.out.println("Harga Telur " + harga_telur + "   x" +telur);
        System.out.println("Harga Air   " + harga_air + "   x" +air);
        System.out.println("harga total nya adalah " + total);
        System.out.println("uang yang dibayar = " + uang_membayar);
        System.out.println("kembalian ani adalah " + uang_kembali);

    }
}
