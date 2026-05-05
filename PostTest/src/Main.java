public class Main {
    public static void main(String[] args) {

        // buat array objet ke superclass
        MetodePembayaran[] daftarPembayaran = new MetodePembayaran[2];

        // masuk object subclass ke array
        daftarPembayaran[0] = new EWallet();
        daftarPembayaran[1] = new KartuKredit();

        System.out.println("=== Proses Semua Pembayaran ===");

        // Looping array
        for (MetodePembayaran pembayaran : daftarPembayaran) {

            //Polymorphism
            pembayaran.bayar(100000);

            // Jika object adalah EWallet
            if (pembayaran instanceof EWallet) {
                EWallet dompet = (EWallet) pembayaran; // downcasting
                dompet.bayar(100000, "08123456789");
            }

            // Jika object adalah KartuKredit
            else if (pembayaran instanceof KartuKredit) {
                KartuKredit kartu = (KartuKredit) pembayaran; // downcasting
                kartu.verifikasiPIN();
            }

            System.out.println();
        }
    }
}
