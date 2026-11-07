public class FeederIkan extends MesinPakan {
    private int jedaJam;

    public FeederIkan(String idAlat, String namaPemilik, int jedaJam) {
        super(idAlat, namaPemilik);
        this.jedaJam = jedaJam;
    }

    @Override
    public void infoAlat() {
        System.out.println("Feeder Ikan | ID: " + getIdAlat() + " | Jeda Waktu: Setiap " + jedaJam + " jam sekali");
    }
}