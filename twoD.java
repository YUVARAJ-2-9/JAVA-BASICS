import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class twoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row value:");
        int n = sc.nextInt();
        System.out.println("Enter teh col value:");
        int m = sc.nextInt();
        int [] [] arr = new int [n] [m];

        System.out.println("Enter the array  values:");
        for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
             }
        }
        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        
    }
}
