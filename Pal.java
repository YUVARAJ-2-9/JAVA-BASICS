import java.util.Scanner;

public class Pal {
    public static void main(String[] args) {
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
}
