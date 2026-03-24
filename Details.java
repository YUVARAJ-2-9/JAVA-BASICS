import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name :");
        String name =input.nextLine();

        System.out.println("enter you age: ");
        int age = input.nextInt();

        System.out.println("enter your stipend:");
        double salary = input.nextDouble();

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

        input.close();
        
    }
    
}
