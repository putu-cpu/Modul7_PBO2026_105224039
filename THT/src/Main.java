import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        
        //ArrayList Upcasting 
        ArrayList<LayananEkspedisi> daftarPaket = new ArrayList<>(); 

        //tambah data 
        daftarPaket.add ( new LayananReguler ("REG-11", 2, 50, 50, 50));

        daftarPaket.add (new LayananExpress( "EXP-22", 5, 10, 10, 10
        ));

        daftarPaket.add ( new LayananInternasional(
                "INT-33", 3, 20, 20, 20,
                "Korea", 100
        ));

          // total pendapatan
        double totalPendapatanPerusahaan = 0.0;

        // looping
        for (LayananEkspedisi paket : daftarPaket) {

            paket.cetakResi();

            // tambah ongkir dasar
            totalPendapatanPerusahaan += paket.hitungOngkir();

            // cek jenis object
            if (paket instanceof LayananReguler) {

                LayananReguler reguler = (LayananReguler) paket;
                System.out.println("Ongkir Member + Jarak: " +
                        reguler.hitungOngkir(true, 25));

            } else if (paket instanceof LayananExpress) {

                LayananExpress express = (LayananExpress) paket;
                express.klaimAsuransi(1500000);

            } else if (paket instanceof LayananInternasional) {

                LayananInternasional internasional =
                        (LayananInternasional) paket;
                internasional.cetakManifest();
            }

            System.out.println("-------------------------");
        }

        // total akhir
        System.out.println("Total Pendapatan Perusahaan: Rp" +
                totalPendapatanPerusahaan);
    }
}

    
