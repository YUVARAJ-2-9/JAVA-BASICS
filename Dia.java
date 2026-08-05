import java.util.Scanner;

public class Dia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n = in.nextInt();
        dia(n);
        dia1(n);
        

       
    }
    static void dia(int n){
         for(int i = 0;i<= n;i++){
            for (int j = 0; j < n*1-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n*1-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
     static void dia1(int n){
         for(int i = 1 ;i<= n;i++){
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <(2*n+1)-(2*i); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
     }

}

