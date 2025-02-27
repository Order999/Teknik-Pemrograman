public class Pelanggan {
    private String nama;
    private String email;

    // Constructor
    public Pelanggan(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Method untuk menampilkan informasi pelanggan
    public void tampilkanInformasiPelanggan() {
        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("Email Pelanggan: " + email);
    }
}
