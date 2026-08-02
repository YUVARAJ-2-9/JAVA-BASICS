<<<<<<< HEAD
public class Even {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = i; j < n-1; j++) {
                if(arr[j] % 2 == 0){
                    int temp = arr[j]; 
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;               }
            }

        }
        for(int i : arr){
            System.out.println(i);
        }
    }
}
=======
package BASICS;

import java.util.Scanner;

public class Even {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter teh number:");
        int num = input.nextInt();

        for(int i=1 ; i<=num;i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
            
 input.close();
}
}
}
>>>>>>> 46837f51ce135bed7ff5ff20cc23e55bf0eac297
