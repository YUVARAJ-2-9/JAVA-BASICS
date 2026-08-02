package BASICS;
import java.util.Scanner;

public class Enterenace {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        System.out.println("enter your age:");
        int age = obj.nextInt();

        System.out.println("Do you have Ticket ! (iruka/illaya?)");
        boolean hasTicket = obj.nextBoolean();

        if(age >= 18 && hasTicket == true){
            System.out.println("Welcome to the show!");

        }
        else{
            System.out.println("Sorry, you cannot enter.");
        }
        obj.close();
    }
}
