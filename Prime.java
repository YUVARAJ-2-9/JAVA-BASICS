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
    }
}