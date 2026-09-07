public class soal5 {
    public static void main(String[] args) {
        int km = 1;
        int feets = 3281;
        double miles = 0.6124;

        double kmtofeets = km * 3281.0;
        double feetstomiles = (feets/ 3281.0) * 0.6124;
        double milestokm = miles / 0.6124;
        System.out.println("hasil konversi " + km + " km ke feets adalah " + kmtofeets );
        System.out.println("hasil konversi " + feets + " feets ke miles adalah " + feetstomiles );
        System.out.println("hasil konversi " + miles + " miles ke km adalah " + milestokm );


    }
}
