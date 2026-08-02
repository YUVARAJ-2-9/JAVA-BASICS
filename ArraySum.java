package BASICS;

import java.util.Scanner;

public class ArraySum {
    public static int calculateSum(int [] arr){
        int total =0;
        for(int i =0; i<5;i++){
            total = total + arr[i];
        }
        return total;

    }
    
    public static void main(String[] args) {

        int [] arr = new int[5];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter teh array elements:");
        for(int i =0 ;i<arr.length;i++){
            arr[i] = input.nextInt();
        }

        int sum = calculateSum(arr);
        System.out.println(sum);
        input.close();



    }
}
