package BASICS;

import java.util.Scanner;

public class Split {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value:");
        String val = input.nextLine().trim();

        String [] word = val.split(" ");

        int count = word.length;

        System.out.println("Total Words :" + count);
        input.close();


        
    }
}
