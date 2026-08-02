package BASICS;

import java.util.Scanner;

public class Meth {

    public static void findGreater(int x, int y, int z){
        if(x>y && x>z){
            System.out.println("X is big!");
        }
        else if(y>x && y> z){
            System.out.println("Y is big!");
        }
        else{
            System.out.println("Z is big!");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value for a:");
        int a = input.nextInt();
        System.out.println("enter the value for b:");
        int b = input.nextInt();
        System.out.println("enter the value for c:");
        int c = input.nextInt();

        findGreater(a, b, c);
        input.close();
    }
    
}
