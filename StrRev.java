<<<<<<< HEAD
import java.util.Arrays;

/**
 * StrRev
 */
public class StrRev {
public static void main(String[] args) {
   String  s = "mani";

   int  l = 0 ;
   int r = s .length()-1;
   int c = 0;

   while (l < r) {
        if(s.charAt(l) == s.charAt(r)){
            c++;
            
        }
        l++;
        r--;

   }
   if(c == s.length()/2){
        System.out.println("Palindrome!");
   }
   else{
    System.out.println("Not a palindrome!");
   }

   

   
}
}
=======
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
        input.close();
    }
    
}
>>>>>>> 46837f51ce135bed7ff5ff20cc23e55bf0eac297
