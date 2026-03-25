package BASICS;


import java.util.Scanner;

class EvenSum{
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        int Even = 0;
        int Odd = 0;
        int [] sum = new int [5];

        System.out.print("Enter the numbers: ");
        for(int i =0 ; i<5 ; i++){
            sum[i]=obj.nextInt();

             if(sum[i] % 2 ==0){
            Even = Even + sum[i];

            
        }
        else{
            Odd = Odd + sum[i];

        }

        }
        System.out.println(Even);
        System.out.println(Odd);
        


       
        
    }
    }