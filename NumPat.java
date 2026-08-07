import java.util.Scanner;

public class NumPat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value");
        int n = in.nextInt();
        

        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = i; j <= num; j++) {
                System.out.print(j+ " ");
                num++;
            }
            System.out.println();
        }
    }
}
