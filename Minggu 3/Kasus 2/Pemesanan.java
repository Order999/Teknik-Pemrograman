public class Pemesanan {
    private Pelanggan pelanggan;
    private Tiket tiket;

    // Constructor
    public Pemesanan(Pelanggan pelanggan, Tiket tiket) {
        this.pelanggan = pelanggan;
        this.tiket = tiket;
    }

    // Getter dan Setter
    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Tiket getTiket() {
        return tiket;
    }

    public void setTiket(Tiket tiket) {
        this.tiket = tiket;
    }

    // Method untuk menampilkan detail pemesanan
    public void tampilkanDetailPemesanan() {
        System.out.println("=== Detail Pemesanan Tiket ===");
        pelanggan.tampilkanInformasiPelanggan();
        tiket.tampilkanDetailTiket();
        System.out.println("==============================");
    }
}
