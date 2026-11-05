public class Main {
    public static void main(String[] args) {

        Kitap kitap = new Kitap("Suç ve Ceza", "Dostoyevski", "12345");

        KitapKopyasi kopya = new KitapKopyasi(1, kitap);

        Kullanici kullanici = new Kullanici(101, "Ahmet Yılmaz");

        OduncKaydi kayit = new OduncKaydi(
            kullanici, kopya, "05.11.2026", "19.11.2026"
        );

        kopya.setOduncte(true);

        System.out.println("Kütüphane Yönetim Sistemi");
        System.out.println("------------------------");
        System.out.println("Kitap: " + kopya.getKitap().getKitapAdi());
        System.out.println("Yazar: " + kopya.getKitap().getYazar());
        System.out.println("Kullanıcı: " + kullanici.getAdSoyad());
        System.out.println("Kopya No: " + kopya.getKopyaNo());
        System.out.println("Ödünç Durumu: " + kopya.isOduncte());
        System.out.println("Ödünç tarihi: 05.11.2026");
        System.out.println("Teslim tarihi: 19.11.2026");
    }
}