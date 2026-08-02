+import java.util.Scanner;

public class NUmPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            int val = 0;      
            for (int j = 0; j < n; j++) {
               if(i <= n/2){
                    if (j <= i) {
                        
                        System.out.print(++val + " ");
                    }
                    else if(i+j >= n){
                         System.out.print(--val + " ");
               }
                    else{
                        System.out.print(val + " " );
               }
                    
               }
        
               
            }
            System.out.println();
        }
    }
}
