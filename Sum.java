package BASICS;

import java.util.Scanner;

public class Sum {
    
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the num:");
        int num = obj.nextInt();
        int sum =1;

        for(int i = 1 ; i<=num;i++){
            sum = sum * i;
        }
      System.out.println(sum);



    }
}
