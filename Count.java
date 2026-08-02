<<<<<<< HEAD
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the num :");
         int n = sc.nextInt();                              

         for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.println(i + " ");
            }
         }
    }

    
=======
package BASICS;

import java.util.Scanner;

public class Count {
    
    public static void main(String[] args) {

        Scanner yuv = new Scanner(System.in);
        int eCount = 0;
        int oCount = 0;
        int [] sum = new int [5];


        System.out.println("enter the numbers:");
        for(int i =0 ; i<5;i++){
            sum[i] = yuv.nextInt();

            if(sum[i] % 2 ==0){
                eCount = eCount + sum[i];
            }
            else{
                oCount = oCount + sum[i];
            }
        }

        System.out.println(eCount);
        System.out.println(oCount);
        
       yuv.close(); 
    }
>>>>>>> 46837f51ce135bed7ff5ff20cc23e55bf0eac297
}
