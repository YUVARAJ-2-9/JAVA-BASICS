package BASICS;
import java.util.Scanner;

public class BookTic {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if(age >= 60){
            int prize = 100;
            System.out.println("Senior citizen ! ");
            System.out.println("50% Discount! " + prize);
        }
        else{
            int prize1 = 200;
            System.out.println("ticket : " + prize1);
        }


    }
    
}
