package BASICS;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
         
        Scanner obj = new Scanner(System.in);
        int [] marks = new int [5];


        System.out.println("enter tghe five numbers:");
        for(int i =0 ; i<5 ;i++){
            marks[i]=obj.nextInt();

        }
        int max = marks[0];

        for(int i =0 ;i<5;i++){
            if(marks[i]>max){
                max = marks[i];

            }


        }
        System.out.println("Largest number "+ max);
        obj.close();
    }
    
    }
