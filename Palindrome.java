package BASICS;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number: ");
        int num = input.nextInt();
        int temp = num;
        int reverse = 0;
                                                                                                                                                                        
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }

        if (temp == reverse) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
