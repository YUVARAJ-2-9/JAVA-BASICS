package BASICS;

import java.util.Scanner;

public class Tracker {

    public static int counterOcc(int []arr, int target){
        int count =0;
        System.out.println("TARGET");
        for(int i =0;i<arr.length;i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
        
    }
    
    public static void main(String[] args) {
        
        int [] arr = new int[5];
        Scanner input = new Scanner(System.in);
        

        System.out.println("Enter teh values:");
        for(int i =0;i<arr.length;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the Target :");
        int target = input.nextInt();

        int finalCount = counterOcc(arr, target);
        System.out.print("OUTPUT");
        for(int i =0 ;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println(finalCount);



    }
}
