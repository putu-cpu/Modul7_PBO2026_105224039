public class LayananInternasional extends LayananEkspedisi {
    
     // Soal 4:
    // Atribut tambahan untuk layanan internasional
    private String negaraTujuan; 
    private double nilaiBarangUSD; 

     // Constructor subclass untuk menginisialisasi atribut parent
    // dan atribut tambahan internasional
    public LayananInternasional (String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi, String negaraTujuan, double nilaiBarangUSD) {
        super (nomorResi, beratAktualKg, panjang, lebar, tinggi); 
        this.negaraTujuan = negaraTujuan; 
        this.nilaiBarangUSD = nilaiBarangUSD; 
    }

    // Override method hitungOngkir()
    // Tarif dasar Rp200.000/kg dari berat efektif
    // Jika nilai barang > 50 USD, dikenakan pajak 20%
    @Override
    public double hitungOngkir() {
        double ongkirDasar = hitungBeratEfektif() * 200000; 
        double pajak = 0; 

        if (nilaiBarangUSD > 50) {
            pajak = ongkirDasar * 0.20; 
        }

        return ongkirDasar + pajak; 
    }

     // Method khusus untuk mencetak manifest internasional 
    public void cetakManifest() {
        System.out.println("Manifest Internasional ke" + negaraTujuan + "Deklarasi Nilai : $" + nilaiBarangUSD);
    }
}

