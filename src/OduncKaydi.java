public class OduncKaydi {
    private Kullanici kullanici;
    private KitapKopyasi kitapKopyasi;
    private String oduncTarihi;
    private String teslimTarihi;

    public OduncKaydi(Kullanici kullanici, KitapKopyasi kitapKopyasi,
                      String oduncTarihi, String teslimTarihi) {
        this.kullanici = kullanici;
        this.kitapKopyasi = kitapKopyasi;
        this.oduncTarihi = oduncTarihi;
        this.teslimTarihi = teslimTarihi;
    }
}