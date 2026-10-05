import java.util.*;
public class bioskop {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Pilih Jenis Studio:");
        System.out.println("1. Reguler");
        System.out.println("2. VIP");
        System.out.print("Masukkan pilihan (1-2): ");
        int pilihan = in.nextInt();
        System.out.println("====================");
        
        int harga;
        int pesanan;
        int total;
        int hari;
        switch (pilihan){
            case 1:
                System.out.println("Jenis Studio Reguler");
                System.out.println("1. Weekday");
                System.out.println("2. Weekend");
                System.out.print("Masukkan hari (1-2): ");
                hari = in.nextInt();
                switch (hari) {
                    case 1:
                        harga = 40000;
                        System.out.print("Masukkan jumlah pesanan: ");
                        pesanan = in.nextInt();
                        if (pesanan <= 0){
                            System.out.println("Invalid.");
                            return;
                        } else if (pesanan > 3){
                            total = (int)((harga * pesanan)-((harga * pesanan) * 0.1));
                        } else {
                            total = harga * pesanan;
                        }
                        System.out.println("====================");
                        System.out.println("Jenis studio: Reguler");
                        System.out.println("Hari        :c Weekday");
                        System.out.println("pemesanan   : " + pesanan);
                        System.out.println("total       : " + total);
                        break;
                    
                    case 2:
                        harga = 50000;
                        System.out.print("Masukkan jumlah pesanan: ");
                        pesanan = in.nextInt();
                        if (pesanan <= 0){
                            System.out.println("Invalid.");
                            return;
                        } else if (pesanan > 3){
                            total = (int)((harga * pesanan)-((harga * pesanan) * 0.1));
                        } else {
                            total = harga * pesanan;
                        }
                        System.out.println("====================");
                        System.out.println("Jenis studio: Reguler");
                        System.out.println("Hari        : Weekend");
                        System.out.println("pemesanan   : " + pesanan);
                        System.out.println("total       : " + total);
                        break;

                    default:
                        System.out.println("Invalid");
                        break;
                }
                break;

            case 2:
                System.out.println("Jenis Studio VIP");
                System.out.println("1. Weekday");
                System.out.println("2. Weekend");
                System.out.print("Masukkan hari (1-2): ");
                hari = in.nextInt();
                switch (hari) {
                    case 1:
                        harga = 75000;
                        System.out.print("Masukkan jumlah pesanan: ");
                        pesanan = in.nextInt();
                        if (pesanan <= 0){
                            System.out.println("Invalid.");
                            return;
                        } else if (pesanan > 3){
                            total = (int)((harga * pesanan)-((harga * pesanan) * 0.1));
                        } else {
                            total = harga * pesanan;
                        }
                        System.out.println("====================");
                        System.out.println("Jenis studio: VIP");
                        System.out.println("Hari        : Weekday");
                        System.out.println("pemesanan   : " + pesanan);
                        System.out.println("total       : " + total);
                        break;

                    case 2:
                        harga = 100000;
                        System.out.print("Masukkan jumlah pesanan: ");
                        pesanan = in.nextInt();
                        if (pesanan <= 0){
                            System.out.println("Invalid.");
                            return;
                        } else if (pesanan > 3){
                            total = (int)((harga * pesanan)-((harga * pesanan) * 0.1));
                        } else {
                            total = harga * pesanan;
                        }
                        System.out.println("====================");
                        System.out.println("Jenis studio: VIP");
                        System.out.println("Hari        : Weekend");
                        System.out.println("pemesanan   : " + pesanan);
                        System.out.println("total       : " + total);
                        break;

                    default:
                        System.out.println("Invalid");
                        break;
                }
                break;

            default:
                System.out.println("Invalid");
        }
    }
}