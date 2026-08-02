package BASICS;

import java.util.Scanner;

public class Largest1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int [] arr = new int [5];

        System.out.println("Enter the Numbers:");
        for(int i = 0; i<5;i++){
            arr[i] = input.nextInt();
        }
        int max = arr [0];

        for(int i =0;i<5;i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        
    System.out.println("ANS:" + max);
    input.close();
    }
}
