import java.util.Scanner;
class Right{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value:");
        int n = in.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}