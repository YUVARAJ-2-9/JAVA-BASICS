package BASICS;

import java.util.Scanner;

public class Count {
    
    public static void main(String[] args) {

        Scanner yuv = new Scanner(System.in);
        int eCount = 0;
        int oCount = 0;
        int [] sum = new int [5];


        System.out.println("enter the numbers:");
        for(int i =0 ; i<5;i++){
            sum[i] = yuv.nextInt();

            if(sum[i] % 2 ==0){
                eCount = eCount + sum[i];
            }
            else{
                oCount = oCount + sum[i];
            }
        }

        System.out.println(eCount);
        System.out.println(oCount);
        
       yuv.close(); 
    }
}
