package BASICS;

import java.util.Scanner;

public class Bubble {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int [] sor = new int [5];


        System.out.println("Enter the 5 values: ");
        for(int i =0 ;i<5;i++){
            sor[i] = input.nextInt();
        }

        for(int i = 0;i<4;i++){
            for(int j = 0 ; j<4;j++){
                if(sor[j] > sor[j+1]){
                    int temp = sor [j];
                    sor[j] = sor[j+1];
                    sor[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for(int i =0;i<5;i++){
            System.out.println(sor[i] + " ");
        }
    }
}
