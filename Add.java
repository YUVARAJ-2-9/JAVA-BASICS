package BASICS;

import java.util.Scanner;

public class Add {
    public static int addNumbers(int a, int b){
        int sum = a + b;
        return sum;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number a:");
        int n1 = input.nextInt();
        System.out.println("Enter the second b:");
        int n2 = input.nextInt();
        
        int result = addNumbers(n1, n2);

        System.out.println(result);
        input.close();
        
    }
}
