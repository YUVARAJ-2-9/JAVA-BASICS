package BASICS;

import java.util.Scanner;


public class Double {


    public static void printEven(int []arr){
        System.out.println("Even Numbers:");
        for(int i =0;i<arr.length;i++){
            if(arr[i] % 2 ==0){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

    }

    public static void printOdd(int []arr){
        System.out.println("Odd Numbers:");
        for(int i =0;i<arr.length;i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] + " ");

            }

        }
        System.out.println();

    }
    
    public static void main(String[] args) {
        int [] arr = new int[5];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array elements: ");
        for(int i =0; i<arr.length;i++){
            arr[i] = input.nextInt();
        }

       printEven(arr);
       printOdd(arr);
    }
}
