import java.util.Scanner;

public class Sub1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("array size:");
        int n = in.nextInt();
        int [] arr = new int [n];
        System.out.print("array values:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
         System.out.println("tar val:");
        int tar = in.nextInt();
        int p1 = 0 ,p2 = 0;
        while(p1 < n){
            int sum = 0;
            for (int i = p1; i <= p2; i++) {
                sum += arr[i];
            }
            
            if(sum >= tar){
                p1++;
                p2 = p1;
                continue;
            }
      
            for (int i = p2+1; i < n; i++) {
                if(sum + arr[i] == tar){
                    for (int j = p1; j <= p2; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.print(arr[i]);
                }
            }
            System.out.println();
            p2++;
        }
    }
}
