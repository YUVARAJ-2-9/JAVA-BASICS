package BASICS;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [] marks = new int[5];
        int sum =0 ;
    
        Scanner input = new Scanner(System.in);

        System.out.println("enter five numL: ");
        for(int i =0 ;i<5;i++){
            marks[i]=input.nextInt();}

        for(int i = 0; i<5 ; i++){
            sum = sum + marks[i];
           

        }
        System.out.println(sum);
        System.out.println("AVG:" + (sum/5));
    
        }
        
        
    }
