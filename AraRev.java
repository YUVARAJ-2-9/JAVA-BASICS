package BASICS;

import java.util.Scanner;



public class AraRev {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int [] num = new int[5];


        System.out.println("enter the numbers:");
        for(int i =0 ; i<5;i++){
            num[i] = obj.nextInt();

        }

        for(int i = 4 ;i>=0;i--){
           System.out.println(num[i]);
            
        }
        obj.close();
        
    }
}

