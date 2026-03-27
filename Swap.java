package BASICS;

import java.util.Scanner;

public class Swap {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int temp ;

        System.out.println("Enter the values a:");
        int swap = input.nextInt();

        System.out.println("Enter the value  b:");
        int swap1 = input.nextInt();

        temp = swap;

        swap = swap1;

        swap1 = temp;

       
        System.err.println(swap);
        System.err.println(swap1);

    }
}
