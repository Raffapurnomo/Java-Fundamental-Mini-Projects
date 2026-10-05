import java.util.*;
public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pin;
        int pin_ulang;
        int max_in_pin = 0;
        int saldo = 1000000;

        System.out.print("Buat pin anda (6 digit): ");
        pin = input.nextInt();
        int jumlah_digit = String.valueOf(pin).length();
        if (jumlah_digit > 6 || jumlah_digit < 6){
            do{
                System.out.print("invalid, coba lagi: ");
                pin = input.nextInt();
                int jumlah_digit1 = String.valueOf(pin).length();
                if (jumlah_digit1 == 6){
                    break;
                }
            }while(jumlah_digit != 6);
        }
        System.out.print("Masukkan ulang pin: ");
        pin_ulang = input.nextInt();
        if (pin_ulang != pin){
            do{
                max_in_pin++;
                System.out.print("invalid, coba lagi: ");
                pin_ulang = input.nextInt();
                if (max_in_pin == 3){
                    return;
                }else if (pin_ulang == pin){
                    break;
                }
            }while(pin_ulang != pin);
        }

        System.out.println("--- ANDA TELAH MASUK ---");
        System.out.printf("1. Nomor Rekening %n2. saldo %n3. Tarik Tunai %n4. Setor Tunai %n");
        System.out.print("Masukkan pilihan(1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                System.out.println("Nomor Rekening: 0812-2943-2280");
                break;
            case 2:
                System.out.println("Saldo: " + saldo);
                break;
            case 3:
                System.out.println("-- PILIH KELIPATAN UANG PENARIKAN --");
                System.out.println("Minimal penarikan adalah 50.000 dan maksimal adalah 500.000");
                System.out.println("penarikan harus kelipatan dari nominal yang dipilih.");
                System.out.printf("1. 50.000 %n2. 100.000 %n");
                System.err.print("Masukkan nominal(1-2): ");
                int penarikan = input.nextInt();
                switch (penarikan){
                    case 1:
                        System.out.print("Masukkan jumlah penarikan: ");
                        int nominal = input.nextInt();
                        if (nominal < 50000){
                            System.out.println("Minimal 50.000!");
                            return;
                        }else if (nominal % 50000 != 0){
                            System.out.println("Harus kelipatan 50.000!");
                            return;
                        }else if (nominal > 500000){
                            System.out.println("Melebihi penarikan maksimal!");
                            return;
                        }
                        saldo -= nominal;
                        System.out.println("=======================");
                        System.out.println("Jumlah penarikan: "+ nominal);
                        System.out.println("Sisa saldo: " + saldo);
                        break;
                    case 2:
                        System.out.print("Masukkan jumlah penarikan: ");
                        nominal = input.nextInt();
                        if (nominal < 100000){
                            System.out.println("Minimal 100.000!");
                            return;
                        }else if (nominal % 100000 != 0){
                            System.out.println("Harus kelipatan 100.000!");
                            return;
                        }else if (nominal > 500000){
                            System.out.println("Melebihi penarikan maksimal!");
                            return;
                        }
                        saldo -= nominal;
                        System.out.println("=======================");
                        System.out.println("Jumlah penarikan: "+ nominal);
                        System.out.println("Sisa saldo: " + saldo);
                        break;
                    default:
                        System.out.println("Invalid");
                }
            case 4:
                System.out.println("-- SETOR TUNAI --");
                System.out.print("Masukkan jumlah setoran: ");
                int setoran = input.nextInt();
                if (setoran < 50000){
                    System.out.println("Minimal setor 50.000");
                    return;
                } else if (setoran % 100000 != 0 && setoran % 50000 != 0){
                    System.out.println("setoran harus berkelipatan 100.000 atau 50.000");
                    return;
                }
                saldo += setoran;
                System.out.println("=======================");
                System.out.println("Setoran: " + setoran);
                System.out.println("Saldo: " + saldo);
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
