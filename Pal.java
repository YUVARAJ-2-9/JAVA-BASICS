package BASICS;

import java.util.Scanner;

public class Pal {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String reverse = "";

        System.out.println("Entre the name :");
        String str = input.nextLine();

        for(int i = str.length()-1;i>=0;i--){
            reverse = reverse + str.charAt(i);

        }
        if (str.equals(reverse)) {
    System.out.println("Machi, idhu Palindrome!");
} else {
    System.out.println("Illai machi, idhu normal string dhaan.");
}
    }
    
}
