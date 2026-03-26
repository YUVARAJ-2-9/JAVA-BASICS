package BASICS;

import java.util.Scanner;

public class Eligible {
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you age :");
        int age = input.nextInt();
        
        if(age>=18){
            System.out.println("ELIGIBLE TO VOTE!");
        
        }
        else{
            System.out.println("NOT ELIGIBLE TO VOTE !");
        }
    }
}
