public class Main {
    public static void main(String[] args) {

        
        PerangkatPintar[] daftarPerangkat = new PerangkatPintar[2];
        //no3
        // Upcasting
        daftarPerangkat[0] = new LampuPintar();
        daftarPerangkat[1] = new AcPintar();

        System.out.println("=== Aktivasi Semua Perangkat ===");

        // Looping array
        for (PerangkatPintar perangkat : daftarPerangkat) {
            perangkat.aktifkan();
        }


        //no4
        System.out.println("\n=== Pengaturan Lampu ===");

        LampuPintar lampu = new LampuPintar();
        lampu.aturKecerahan(70);
        lampu.aturKecerahan(85, "Putih");

        System.out.println("\n=== Pengaturan AC ===");

        for (PerangkatPintar perangkat : daftarPerangkat) {
            if (perangkat instanceof AcPintar) {
                AcPintar ac = (AcPintar) perangkat;
                ac.aturSuhu(18);
            }
        }


        //no5 error
        System.out.println("\n=== Pengaturan Lampu via Superclass Reference ===");

        PerangkatPintar alat1 = new LampuPintar();

        if (alat1 instanceof LampuPintar) {
            LampuPintar lampuCast = (LampuPintar) alat1;
            lampuCast.aturKecerahan(75, "Putih");
        }
    }
}
