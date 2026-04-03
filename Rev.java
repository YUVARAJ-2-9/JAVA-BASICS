package BASICS;

import java.util.Scanner;

public class Rev {

    public static void reverseArray(int[]arr){
        int [] arr1 = new int [5];
        int start = 0;
        int temp;
        int end = arr.length-1;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        start++;
        end--;

        }

       
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int [5];

        System.out.println("Enter the array values:");
        for(int i =0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }

        reverseArray(arr);

        System.out.println("Reversed Array:");{
            for(int i =0 ;i<arr.length;i++){
                System.out.println(arr[i] + " ");
            }
        }
    }
    
}
