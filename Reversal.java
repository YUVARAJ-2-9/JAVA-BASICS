package BASICS;

import java.util.Scanner;

public class Reversal {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int [] arr = new int [5];

        System.out.println("Enter the numbers:");
        for(int i =0;i<5;i++){
            arr[i] = input.nextInt();

        }
        for(int i =4;i>=0;i--){
            System.out.println("REVERSAL:" + arr[i]);

        }
        
           input.close();
        }
    

    }

