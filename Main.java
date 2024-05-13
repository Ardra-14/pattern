import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = s.nextInt();
        for (int i = 1; i <= rows ; i++){
            for (int k = 1; k <= (rows - i) ; k++){
                System.out.print(" ");
            }
            for (int j =1 ; j<=i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}