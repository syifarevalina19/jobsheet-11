import java.util.Scanner;

public class SegitigaBintang {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 7; i > 0; i--){
            for(int j = 1; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
}
