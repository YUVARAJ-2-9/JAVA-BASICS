package BASICS;

import java.util.Scanner;

public class Smallest {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int [] small = new int [5];
        int sum =0;

        System.out.println("Enter the numbers:");
        for(int i =0 ;i<5;i++){
            small[i] = input.nextInt();
        }

        int min= small[0];
        for(int i = 0;i<5;i++){
            if(small[i] < min){
                min = small[i];
                
            }
        }
        for(int i =0;i<5;i++){
            sum = sum + small[i];
        }
       
        System.out.println("Small value:" + min);
        System.out.println("SUM:" + sum);
        System.out.println("AVG:" + sum/5);
        input.close();

    }
}
