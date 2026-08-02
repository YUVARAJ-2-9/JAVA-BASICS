package BASICS;

import java.util.Scanner;

public class Lin {
    
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        int [] arr = new int [5];

        System.out.println("Enter the 5 number:");
        for(int i =0;i<5;i++){
            arr[i] = n.nextInt();
        }
        System.out.println("Enter the number to Serach:");
        int target = n.nextInt();
        boolean found = false;
        
        for(int i =0;i<5;i++){
          
            if(arr[i] == target){
                found = true;
                break;
            }

            
        }
        if(found){
            System.out.println("Value Found!");
        }
        else{
            System.out.println("Not Found!!");
        }
        


    }
}
