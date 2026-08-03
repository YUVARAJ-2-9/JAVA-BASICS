import java.util.Arrays;
import java.util.Scanner;

public class Sub {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int tar = 50;
         int c = 0;
        for (int i = 0; i < n; i++) {     
            for (int j = 0; j < n; j++) {
                if(arr[i] + arr[j] == tar){
                    c++;
                }
            }
        }
        int [] arr1 = new int[c]; 
        int index = 0;

        for (int i = 0; i <  n-1; i++) {
            for (int j = 0; j < n; j++) {
                
            }
        }
        System.out.print(Arrays.toString(arr1));

    }
}
