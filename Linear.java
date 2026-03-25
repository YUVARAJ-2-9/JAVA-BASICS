package BASICS;

import java.util.Scanner;

public class Linear {
    
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int [] marks = new int [5];
        


    System.out.println("enter the number:");
    for(int i = 0;i<5;i++){
        marks[i]=obj.nextInt();
    }
    System.out.println("enter the target:");
    int num = obj.nextInt();

    boolean found = false;
    for(int i = 0; i<5;i++){
        if(marks[i] == num){
            found = true ;
            break;

        }
        
       
    }
    if(found){
            System.out.println("Target Found !");
        }
    else{
            System.out.println("Target not found!");
        }
    
    
       
    }
    

   
    }
