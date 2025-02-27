import java.util.ArrayList;

public class Restaurant{

    private ArrayList<Menu> makanan;
    private static byte id = 0;
    
    public Restaurant(){
        makanan = new ArrayList<>();
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        makanan.add(new Menu(nama, harga, stok, id));
        id++;
    }

    public void tampilMenuMakanan() {
        for(int i = 0; i < makanan.size(); i++ ) {
            System.out.println(makanan.get(i).getNama() + "[" + makanan.get(i).getStok() + "]\tRp " + makanan.get(i).getHarga()+ " Id: "+makanan.get(i).getId());
        }
    }

    public void pesanMenu(byte Id){
        if(makanan.get(Id).getStok() == 0){
            System.out.println("Menu sudah habis. Mohon pilih menu lain");
        }
        else{
            makanan.get(Id).setStok(makanan.get(Id).getStok()-1);
            System.out.println(makanan.get(Id).getNama()+" berhasil dipesan. Stok "+makanan.get(Id).getNama()+" sekarang menjadi "+makanan.get(Id).getStok());
        }
    }

    public void tambahStokMenu(byte Id, int stok){
        makanan.get(Id).setStok(makanan.get(Id).getStok() + stok);
        System.out.println("Stok "+makanan.get(Id).getNama()+" telah ditambah. Sekarang, stok menjadi "+makanan.get(Id).getStok());
    }

}