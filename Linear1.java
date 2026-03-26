package BASICS;

import java.util.Scanner;

public class Linear1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int [] arr = new int [5];


        System.out.println("Enter the values:");
        for(int i = 0 ;i<5;i++){
            arr[i] = input .nextInt();
        }

        System.out.println("enter the target:");
        int target = input.nextInt();

        boolean found = false;
        int foundAt= -1;
        for(int i = 0;i<5 ;i++){
            if(arr[i] == target){
                found = true ;
                foundAt =i;
                break;

            }

           
        }
         if(found){
                System.out.println("index found " + foundAt );
            }
            else{
                System.out.println("not found!");
            }
    }
}
