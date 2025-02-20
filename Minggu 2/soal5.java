import java.util.Scanner;
public class soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka kata pertama : ");
        String satu = sc.next();
        System.out.print("Masukkan angka kata kedua   : ");
        String dua = sc.next();

        int sum = satu.length() + dua.length();
        System.out.println(sum);

        if (satu.compareTo(dua) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String satuKapital = satu.substring(0, 1).toUpperCase() + satu.substring(1);
        String duaKapital = dua.substring(0, 1).toUpperCase() + dua.substring(1);
        System.out.println(satuKapital + " " + duaKapital);

        sc.close();
    }
}
