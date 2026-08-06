import java.util.Scanner;

public class Hallow1 {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n = in.nextInt();
        Hallow(n);
        Hallow1(n);
        }

        static void Hallow(int n){
            for (int i = 0; i < n ; i++) {
                for (int j = n; j > i ; j--) {
                    System.out.print("*");
                }
                for (int j = 1; j <= 2*i; j++) {
                    System.out.print(" ");
                }
                for (int j = n; j > i ; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        static void Hallow1(int n){
            for (int i = 0; i < n ; i++) {
                for (int j = 0; j <=i  ; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j < (2*n+1)-(i*2+2); j++) {
                    System.out.print(" ");
                }
                for (int j =0; j <= i ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

