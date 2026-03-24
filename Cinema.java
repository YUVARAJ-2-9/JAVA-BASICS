package BASICS;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter you age:");
        int age = input.nextInt();

        if(age<=12){
            int pr1 = 50;
            System.out.println("Ticket prize :" + pr1);
        }

        else if (age>=60) {
            int pr2 = 100;
            System.out.println("Ticket prize :" + pr2);
            
        }

        else{
            int pr3=200;
            System.out.println("Ticket prize " + pr3);
        }
    }
}
