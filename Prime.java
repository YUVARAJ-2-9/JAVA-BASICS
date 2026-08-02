<<<<<<< HEAD
import java.util.Scanner;

/**
 * Prime
 */
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n = sc.nextInt();

        int count = 0;
        for(int i = 1;i<=n;i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime!");
        }
        else{
            System.out.println("Not a Prime!");
        }
    }
    
=======
package BASICS;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the num:");
        int num = obj.nextInt();

        int count = 0;
        for(int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        } // Loop inge mudinjiduchu!

        // Ippo thaan check pannanum
        if(count == 2) {
            System.out.println("Prime!");
        } else {
            System.out.println("Not Prime!");
        }
        obj.close();
    }
>>>>>>> 46837f51ce135bed7ff5ff20cc23e55bf0eac297
}