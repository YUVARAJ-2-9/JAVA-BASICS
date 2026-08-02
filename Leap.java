package BASICS;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        
        Scanner yuv = new Scanner(System.in);

        System.out.println("Enter the year :");
        int year = yuv.nextInt();


        if((year  % 4 == 0 && year % 100 != 0) ||(year %  400 == 0)) {

        System.out.println("leap year!! " );
        }

        else{
            System.out.println("not a leap year!");
        }
        yuv.close();

       
    }
}
