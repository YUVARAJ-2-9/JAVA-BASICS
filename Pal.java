<<<<<<< HEAD
=======
package BASICS;

>>>>>>> 46837f51ce135bed7ff5ff20cc23e55bf0eac297
import java.util.Scanner;

public class Pal {
    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n = sc.nextInt();
        int rev = 0;
        int temp = n;
        while (temp > 0) {
            int ld = temp % 10;
            rev = (rev*10) + ld;
            temp /= 10;

        }
        System.out.println(rev);
        if(rev == n){
            System.out.println("Palindrome!");
        }
        else{
            System.out.println("Not a Palindrome!");
        }
    }
=======
        
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
    
>>>>>>> 46837f51ce135bed7ff5ff20cc23e55bf0eac297
}
