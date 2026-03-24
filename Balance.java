import java.util.Scanner;

public class Balance {
        public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);

            System.out.println("enter total amount: ");
            double total = input.nextDouble();

            System.out.println("enter spent amount: ");
            double Spent = input.nextDouble();

            
            double Balance =total - Spent;

            
            System.out.println(Balance);                }
}
