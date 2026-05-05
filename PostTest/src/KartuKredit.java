public class KartuKredit extends MetodePembayaran{
    //no3
    @Override 
    void bayar(double nominal){
        System.out.println("Mencetak tagihan Kartu Kredit sebesar Rp" + nominal + "...");
    }
    //method khusus
    void verifikasiPIN() {
        System.out.println("Memverifikasi PIN Kartu Kredit...BERHASIL !");
    }
    
}
