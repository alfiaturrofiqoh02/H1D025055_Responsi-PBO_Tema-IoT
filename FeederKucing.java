public class FeederKucing extends MesinPakan implements KontrolAlat, KoneksiWiFi {
    private int kapasitasPorsiGram;

    public FeederKucing(String idAlat, String namaPemilik, int kapasitasPorsiGram) {
        super(idAlat, namaPemilik);
        this.kapasitasPorsiGram = kapasitasPorsiGram;
    }

    @Override
    public void nyalakan() {
        if (!isStatusAktif()) {
            setStatusAktif(true);
            System.out.println("Feeder Kucing BERHASIL DIHIDUPKAN.");
        } else {
            System.out.println("Feeder Kucing sudah aktif.");
        }
    }

    @Override
    public void matikan() {
        if (isStatusAktif()) {
            setStatusAktif(false);
            System.out.println("Feeder Kucing DIMATIKAN.");
        } else {
            System.out.println("Feeder Kucing sudah mati.");
        }
    }

    @Override
    public void hubungkan() {
        System.out.println("Alat " + getIdAlat() + " terhubung ke WiFi.");
    }

    @Override
    public void infoAlat() {
        System.out.println("Feeder Kucing | ID: " + getIdAlat() + " | Pemilik: " + getNamaPemilik() + " | Porsi: " + kapasitasPorsiGram + " gram");
    }
}