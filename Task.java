package BASICS;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner chi = new Scanner(System.in);
        System.out.println("Enter the value:");
        String val = chi.nextLine().toLowerCase();


        int vCount =0;  int cCount =0;

        for(int i = 0;i<val.length();i++){
            char ch = val.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;
            } else if(ch >= 'a' && ch <= 'z') {
                cCount++;
            }
        }

        System.out.println("Print Vcount:" + vCount);
        System.out.println("Print Ccount:" + cCount);
        
    }
}
