public class Film {
    private String judul;
    private String jadwalTayang;
    private double hargaTiket;

    // Constructor
    public Film(String judul, String jadwalTayang, double hargaTiket) {
        this.judul = judul;
        this.jadwalTayang = jadwalTayang;
        this.hargaTiket = hargaTiket;
    }

    // Getter dan Setter
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJadwalTayang() {
        return jadwalTayang;
    }

    public void setJadwalTayang(String jadwalTayang) {
        this.jadwalTayang = jadwalTayang;
    }

    public double getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(double hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    // Method untuk menampilkan informasi film
    public void tampilkanInformasiFilm() {
        System.out.println("Judul Film: " + judul);
        System.out.println("Jadwal Tayang: " + jadwalTayang);
        System.out.println("Harga Tiket: Rp " + hargaTiket);
    }
}

