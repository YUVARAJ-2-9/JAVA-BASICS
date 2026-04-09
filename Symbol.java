package BASICS;

import java.util.Scanner;

public class Symbol {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Text:");
        String val = input.nextLine();
        String result = "";


        for(int i = 0; i<val.length(); i++){
            char res = val.charAt(i);

            if(res =='a' || res == 'e' || res == 'i' || res == 'o' || res == 'u'){
                result = result + '*';
            }
            else{
                result = result + res;
            }

            System.out.println("OUTPUT :" + result);
        }

        
    }
}
