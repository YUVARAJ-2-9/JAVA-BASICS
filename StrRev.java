package BASICS;

import java.util.Scanner;




public class StrRev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value:");
        String name = input.nextLine();

        String rev = "";
        for(int i =name.length()-1 ;i>=0;i--){
        rev = rev + name.charAt(i);

        }
        System.out.println("Reversed:" + rev);
    }
    
}
