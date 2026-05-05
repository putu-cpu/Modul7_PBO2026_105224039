public class EWallet extends MetodePembayaran {
    //no2
    @Override
    void bayar(double nominal) {
        System.out.println("Memotong saldo E-Wallet sebesar Rp" + nominal + "...");

    }
    //no2 overloading
    void bayar(double nominal, String nomorHp) {
        System.out.println("Memotong saldo E-Wallet sebesar Rp" + nominal + "dari nomor" + nomorHp + "...");
    }
}
