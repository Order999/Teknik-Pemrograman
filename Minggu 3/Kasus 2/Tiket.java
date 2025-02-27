public class Tiket {
    private Film film;
    private String nomorKursi;

    // Constructor
    public Tiket(Film film, String nomorKursi) {
        this.film = film;
        this.nomorKursi = nomorKursi;
    }

    // Getter dan Setter
    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public String getNomorKursi() {
        return nomorKursi;
    }

    public void setNomorKursi(String nomorKursi) {
        this.nomorKursi = nomorKursi;
    }

    // Method untuk menampilkan detail tiket
    public void tampilkanDetailTiket() {
        film.tampilkanInformasiFilm();
        System.out.println("Nomor Kursi: " + nomorKursi);
    }
}
