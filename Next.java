package BASICS;

import java.util.Scanner;

public class Next {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value :");
        String val = input.nextLine();
        String rev = "";

        for(int i =val.length()-1;i>=0;i--){
            rev = rev + val.charAt(i);
        }

        if(val.equals(rev)){
            System.out.println("It is Palindrome!");
        }
        else{
            System.err.println("Not Palindrome!");
        }
        input.close();


    }
}
