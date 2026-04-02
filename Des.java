package BASICS;

import java.util.Scanner;

public class Des {
    public static boolean isEligible(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int val = input.nextInt();

        boolean result = isEligible(val);
        System.out.println(result);
input.close();

    }
}
