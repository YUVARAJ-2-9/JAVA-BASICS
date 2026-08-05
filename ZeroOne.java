import java.util.Scanner;

public class ZeroOne {
  public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n = in.nextInt();
        int s  = 1;
        for (int i = 0; i <= n; i++) {
            if(i % 2 == 0){
                s = 1;
            }
            else{
                s = 0;
            }
            for (int j = 0; j < i; j++) {
                System.out.print(s+ " ");
                s = 1 - s;
            }
            System.out.println();
        }
  }  
}
  