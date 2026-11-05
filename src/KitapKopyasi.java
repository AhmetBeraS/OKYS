public class KitapKopyasi {
    private int kopyaNo;
    private Kitap kitap;
    private boolean oduncte;

    public KitapKopyasi(int kopyaNo, Kitap kitap) {
        this.kopyaNo = kopyaNo;
        this.kitap = kitap;
        this.oduncte = false;
    }

    public int getKopyaNo() {
        return kopyaNo;
    }

    public Kitap getKitap() {
        return kitap;
    }

    public boolean isOduncte() {
        return oduncte;
    }

    public void setOduncte(boolean oduncte) {
        this.oduncte = oduncte;
    }
}