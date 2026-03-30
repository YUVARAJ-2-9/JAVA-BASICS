package BASICS;
import java.util.Scanner;

public class Str {

    public static void main(String[] args) {
        
        Scanner str = new Scanner(System.in);

        System.out.println("Enter the Value: ");
        String name = str.nextLine();

        int count = 0;
        for(int i =0 ;i<name.length();i++){
            char ch =name.charAt(i);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count++;

        }
    }
    System.out.println("Total vowels  in your text " + count);
    
}

}

