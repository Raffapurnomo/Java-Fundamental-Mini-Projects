import java.util.*;
public class piramida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tinggi = input.nextInt();

        for (int i = 1; i <= tinggi; i++){
            for (int spasi = 1; spasi <= tinggi-i; spasi++){
                System.out.print("  ");
            }

            for (int j = i; j >=2; j--){
                System.out.print(j + " ");
            }


            for (int j = 1; j <= tinggi; j++){
                if (i >= j){
                    System.out.print(j + " ");  
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
