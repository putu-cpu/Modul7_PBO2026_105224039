public class LayananEkspedisi {

    // Membuat atribut dengan access modifier protected
    // agar dapat diwariskan ke subclass
    protected String nomorResi; 
    protected double beratAktualKg;
    protected double panjang; 
    protected double lebar; 
    protected double tinggi; 

    // Constructor untuk menginisialisasi seluruh atribut
    public LayananEkspedisi(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi){

        this.nomorResi       = nomorResi; 
        this.beratAktualKg   = beratAktualKg; 
        this.panjang         = panjang; 
        this.lebar           = lebar; 
        this.tinggi          = tinggi; 
    }

    // Soal 1:
    // Method menghitung berat efektif
    // Berat efektif = max(berat aktual, berat volumetrik)
    // Rumus volumetrik = (P x L x T) / 6000
    public double hitungBeratEfektif () {
        double beratVolumetrik = (panjang * lebar * tinggi) / 6000; 

        if (beratAktualKg > beratVolumetrik) {
            return beratAktualKg; 
        }else{
            return beratVolumetrik; 
        }
    }

   // Soal 1:
   // Method untuk mencetak nomor resi dan berat efektif
    public void cetakResi() {
        System.out.println("Nomor Resi : "  + nomorResi);
        System.out.println("Berat Efektif : " + hitungBeratEfektif() + "kg");
    }

     // Soal 1:
    // Method polymorphic dasar, akan dioverride pada subclass
    public double hitungOngkir() {
        return 0.0; 
    }

}
