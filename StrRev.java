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