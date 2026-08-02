package BASICS;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        
        Scanner obj =new Scanner(System.in);

        System.out.println("enter num:");
        int num = obj.nextInt();

        for(int i = 10 ; i>=1 ;i--){
             System.out.println(num + "X" + i + "=" + (num*i));
        
        }
        obj.close();
    }
}
