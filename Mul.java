package BASICS;

import java.util.Scanner;

public class Mul {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter the num:");
        int num = input.nextInt();

        for(int i = 10 ;i>=1;i--){
            System.out.println(num + "*" + i + "=" + (num*i));
        }
        input.close();
        
    }
    
}

