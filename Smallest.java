package BASICS;

import java.util.Scanner;

public class Smallest {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int [] small = new int [5];

        System.out.println("Enter the numbers:");
        for(int i =0 ;i<5;i++){
            small[i] = input.nextInt();
        }

        int min= small[0];
        for(int i = 0;i<5;i++){
            if(small[i] < min){
                min = small[i];
            }
        }
        System.out.println("Small value:" + min);
        input.close();

    }
}
