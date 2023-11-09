import java.util.Scanner;

public class SegitigaAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j <= 4 - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i + 1; k++) {
                System.out.print(k);
        }
        System.out.println();
        }
    }
}
     
