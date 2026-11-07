public class MainMesinPakan {
    public static void main(String[] args) {
        KontrolAlat kontrol = new FeederKucing("CAT-01", "Alfi", 50);
        KoneksiWiFi wifi = (KoneksiWiFi) kontrol;
        FeederKucing cat = (FeederKucing) kontrol;

        wifi.hubungkan();
        cat.infoAlat();

        kontrol.nyalakan();
        kontrol.nyalakan();
        kontrol.matikan();

        System.out.println("--------------------------------------------------");

        MesinPakan fish = new FeederIkan("FISH-02", "Alfi", 12);
        fish.infoAlat();
    }
}