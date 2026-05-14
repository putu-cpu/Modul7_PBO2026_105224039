public class LayananExpress extends LayananEkspedisi {
    
    // Soal 3:
    // Constructor subclass LayananExpress
    // Memanggil constructor parent menggunakan super
    public LayananExpress(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
        super (nomorResi, beratAktualKg, panjang, lebar, tinggi); 
    }

    // Override method hitungOngkir()
    // Tarif Express = Rp30.000 per kg berdasarkan berat efektif 
    @Override 
    public double hitungOngkir() {
        return hitungBeratEfektif () * 30000;
    }

    // Method khusus untuk klaim asuransi
    // Jika nilai barang > Rp1.000.000 maka VIP
    public void klaimAsuransi (double nilaiBarang) {
        if (nilaiBarang > 1000000) {
            System.out.println("Klaim Asuransi VIP Rp" + nilaiBarang + "untuk resi" + nomorResi + "sedang diproses prioritas.");
        }else{
            System.out.println("Klaim Asuransi Standar diproses dalam 7 hari kerja.");
        }
    }
}
