import java.util.*;
public class tebakangka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random acak = new Random();
        int tebakan = 0;
        int angka = acak.nextInt(101);
        int angka_input;
        float skor = 10.0F;

        do {
            System.out.print("Masukkan angka tebakkan anda: ");
            angka_input = input.nextInt();
            if (angka_input < angka){
                System.out.println("Angka terlalu kecil!");
                tebakan ++;
            } else if (angka_input > angka){
                System.out.println("Angka terlalu besar!");
                tebakan++;
            }

        }while (angka_input != angka);

        System.out.println("==========================");
        System.out.println("Selamat tebakkan anda benar");
        System.out.println("Skor: " + (skor - (0.25*tebakan)));
        System.out.println("Jumlah tebakan: " + tebakan);

    }
}
