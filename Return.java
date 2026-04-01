package BASICS;

import java.util.Scanner;

public class Return {
    
    public static int getSquare(int x) {
        return x *  x;
        
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value :");
        int n = input.nextInt();

       int result= getSquare(n);
       System.out.println(result);
        input.close();
    }
}
