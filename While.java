package BASICS;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("enter num: ");
        int num = obj.nextInt();

        
        int i =1 ;
        while (i<=10) {
              System.out.println(num + "*" + i + "=" + (num*i));
        
          i++;  
        }
        

        
    }
}
