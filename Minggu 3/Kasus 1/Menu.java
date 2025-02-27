public class Menu {
    private final String nama;
    private final double harga;
    private int stok;
    private final byte id;

    public Menu(String nama, double harga, int stok, byte id) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.id = id;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk harga
    public double getHarga() {
        return harga;
    }

    // Getter untuk nama
    public int getStok() {
        return stok;
    }

    // Getter untuk id
    public byte getId(){
        return id;
    }
    
    // Setter untuk mengubah stok
    public void setStok(int stok) {
        this.stok = stok;
    }
}
