import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Membuat objek film
        Film film1;

        while (true){
            System.out.println("=====================Bioskop======================");
            System.out.println("| No. |   Judul Film   | Jadwal Tayang |  Harga  |");
            System.out.println("==================================================");
            System.out.println("  1   | Captain America|      19:00    |  75.000 |");
            System.out.println("  2   |    Spongebob   |      18:30    |  40.000 |");
            System.out.println("  3   |    Spiderman   |      20:00    |  60.000 |");
            System.out.println("==================================================");
            System.out.print("\nMasukkan pilihan anda (1-3): ");
            byte pilihan = sc.nextByte();
                
            if(pilihan == 1){
                film1 = new Film("Captain America", "19:30", 75000);
                break;
            }
            else if (pilihan == 2){
                film1 = new Film("Spongebob", "18:30", 40000);
                break;
            }
            else if (pilihan == 3){
                film1 = new Film("Spiderman", "20:00", 60000);
                break;
            }
            else{
                System.out.println("Mohon masukkan pilihan yang tepat");
                continue;
            }
        }
        // Membuat objek Pelanggan
        Pelanggan pelanggan1 = new Pelanggan("Ivan Setiawan", "ivan@polban.com");

        // Membuat objek Tiket
        Tiket tiket1 = new Tiket(film1, "A15");

        // Membuat objek Pemesanan
        Pemesanan pemesanan1 = new Pemesanan(pelanggan1, tiket1);

        // Menampilkan detail pemesanan
        pemesanan1.tampilkanDetailPemesanan();
        
        sc.close();
    
    }
}
