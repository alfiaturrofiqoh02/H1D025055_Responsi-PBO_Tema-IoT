public abstract class MesinPakan {
    public static final String MERK = "PetSmart";
    private final String idAlat;
    private String namaPemilik;
    private boolean statusAktif;

    public MesinPakan(String idAlat) {
        this.idAlat = idAlat;
        this.namaPemilik = "Alfi";
        this.statusAktif = false;
    }

    public MesinPakan(String idAlat, String namaPemilik) {
        this.idAlat = idAlat;
        this.namaPemilik = namaPemilik;
        this.statusAktif = false;
    }

    public String getIdAlat() { return idAlat; }
    public String getNamaPemilik() { return namaPemilik; }
    public void setNamaPemilik(String namaPemilik) { this.namaPemilik = namaPemilik; }
    public boolean isStatusAktif() { return statusAktif; }
    public void setStatusAktif(boolean statusAktif) { this.statusAktif = statusAktif; }

    public abstract void infoAlat();
}