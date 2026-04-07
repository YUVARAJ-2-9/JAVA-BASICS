package BASICS;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String value:");
        String name = input.nextLine();

        String trimmer = name.trim();
        String lower = name.toUpperCase();
        int size = name.length();

        System.out.println(trimmer);
        System.out.println(lower);
        System.out.println(size);

        
        
        

    }
}
