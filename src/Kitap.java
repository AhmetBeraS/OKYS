public class Kitap {
    private String kitapAdi;
    private String yazar;
    private String isbn;

    public Kitap(String kitapAdi, String yazar, String isbn) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        this.isbn = isbn;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public String getYazar() {
        return yazar;
    }

    public String getIsbn() {
        return isbn;
    }
}