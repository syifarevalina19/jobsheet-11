import java.util.Scanner;

public class NestedLoop_NIM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [][] temps = new double [5][7];
        
        for (int i = 0; i < temps.length; i++) { 
            System.out.println("Kota ke-" + i);
        } 
        for (int j = 0; j < temps[0].length; j++) {
            System.out.print("Hari ke-" + (j + 1) + ": "); 
            temps[1][j] = sc.nextDouble();
        }
        System.out.println();

        for (int i = 0; i < temps.length; i++) {
             System.out.println("Kota ke-" + (i + 1) + ": ");
        }
        for (int j = 0; j < temps[0].length; j++) { 
            System.out.print(temps [1][j] + " ");
        }
        System.out.println();
    }
}
