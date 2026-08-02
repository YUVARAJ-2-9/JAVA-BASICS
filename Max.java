package BASICS;

import java.util.Scanner;

public class Max {

    public static int findMax(int [] arr){
        int max = arr[0];
       for(int i =1;i<arr.length;i++){
        if(arr[i] > max){
            max = arr[i];
        }
       }
       return max;
    }

    public static int searchElm(int [] arr , int key){
        
        for(int i =0;i<arr.length;i++){
            if(arr[i] == key){
                return i;

            }
        
        }
        return -1;
    }    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int[5];

        System.out.println("Enter the value:");
        for(int i=0 ; i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        int result = findMax(arr
        );

        System.out.println("RESULT" + result);
        

        System.out.println("enter target:");
        int target = input.nextInt();

        int res = searchElm(arr, target);
        System.out.println("ANS: " + res);
        input.close();
        
    }
}
