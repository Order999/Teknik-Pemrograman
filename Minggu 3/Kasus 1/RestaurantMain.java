import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala",1_000 , 20 );
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        menu.tambahMenuMakanan("Molen", 1_000, 20);

        while(true){
            System.out.println("=====Restoran=====");
            System.out.println("1. Lihat Menu");
            System.out.println("2. Pesan Menu");
            System.out.println("3. Tambah Stok");
            System.out.println("4. Keluar");
            System.out.print("\nMasukkan pilihan : ");
            int pilihan = sc.nextInt();
            
            if(pilihan == 1){
                menu.tampilMenuMakanan();
            }
            else if (pilihan == 2){
                menu.tampilMenuMakanan();
                System.out.print("Pilih menu yang ingin dipesan menggunakan id : ");
                pilihan = sc.nextInt();
                menu.pesanMenu((byte) pilihan);
            }
            else if (pilihan == 3){
                menu.tampilMenuMakanan();
                System.out.print("\nPilih nomor id menu yang ingin ditambah stok : ");
                pilihan = sc.nextInt();
                System.out.print("\nMasukkan jumlah stok : ");
                int stok = sc.nextInt();
                menu.tambahStokMenu((byte) pilihan, stok);
            }   
            else if (pilihan == 4){
                break;
            }
        }
        sc.close();
    }
    
}
