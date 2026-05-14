public class LayananReguler extends LayananEkspedisi {
    
     // Soal 2:
    // Constructor subclass LayananReguler
    // Memanggil constructor parent menggunakan super
    public LayananReguler (String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        super (nomorResi, beratAktualKg, panjang, lebar, tinggi); 
    }

    // Override method hitungOngkir()
    // Tarif reguler = Rp15.000 per kg berdasarkan berat efektif
    @Override
    public double hitungOngkir() {
        return hitungBeratEfektif() * 15000; 
    }

    // Overloading method hitungOngkir()
    // Menambahkan diskon member dan surcharge jarak
    public double hitungOngkir (boolean isMember, int jarakKm) {
        double tarifDasar = hitungOngkir();

     // Jika member, berikan diskon 10% dari tarif dasar
    if (isMember) {
        tarifDasar = tarifDasar - (tarifDasar * 0.10); 
    }

   // Tambahkan surcharge Rp500 per km
    double surcharge = jarakKm * 500; 

    return tarifDasar + surcharge; 
       
    }
}
