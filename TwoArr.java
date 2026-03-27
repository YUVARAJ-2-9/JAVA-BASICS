package BASICS;

import java.util.Scanner;

public class TwoArr {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int [][] matrix = new int [2][2];

        System.out.println("Enter the values:");
        for(int i =0;i<2;i++){
            for(int j =0 ; j<2;j++){
                matrix[i] [j]=input.nextInt();
            }
        }
        int total =0;
        int diaSum = 0;
        System.out.println("MATRIX!");
        for(int i =0;i<2;i++){
            for(int j =0;j<2;j++){
                System.out.print(matrix[i][j] + " ");
                total = total + matrix [i][j];

                if(i != j){
                    diaSum = diaSum + matrix[i] [j];
                }
            }
            System.out.println();
        }
        System.out.println(total);
        System.out.println(diaSum);
    }
}