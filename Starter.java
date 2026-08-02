package BASICS;

import java.util.Scanner;

public class Starter {

    public static double avgFind(int[]cal){

        int sum = 0;
        for(int i =0;i<cal.length;i++){
        sum = sum +cal[i];
         

        }


        double avg = (double) sum / cal.length;
        return avg;


    }

    public static String gradeChanger(double avg){

        if(avg >=90){
            return "O Grade!";
        }
        else if(avg >= 80){
            return "A Grade!";
        }
        else if(avg >= 60 ){
            return "B Grade!";

        }
        else if(avg >= 50){
            return "PASS!";
        }
        else{
            return "FAIL!";
        }

    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] cal = new int[5];

        System.out.println("Enter Array Values:");
        for(int i =0;i<cal.length;i++){
            cal[i] = input.nextInt();
        }

        double avg =  avgFind(cal);
        String grade = gradeChanger(avg);

        System.out.println("Average:" + avg);
        System.out.println("Grade:" + grade);

        input.close();


       }
}
