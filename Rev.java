<<<<<<< HEAD
class Rev{
    public static void main(String[] args) {
        int n = 1313;
        rev(n);
    }
    public static int rev(int n){
        int rev = 0;
        int temp = n;
        while (temp > 0) {
            int ld = temp % 10;
            rev = (rev*10) + ld;
            temp /= 10;
     }
        System.out.println(rev);
        return n;
    }
}
=======
package BASICS;

import java.util.Scanner;

public class Rev {

    public static void reverseArray(int[]arr){
        int [] arr1 = new int [5];
        int start = 0;
        int temp;
        int end = arr.length-1;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

        start++;
        end--;

        }

       
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int [5];

        System.out.println("Enter the array values:");
        for(int i =0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }

        reverseArray(arr);

        System.out.println("Reversed Array:");{
            for(int i =0 ;i<arr.length;i++){
                System.out.println(arr[i] + " ");
            }
        }
        input.close();
    }
    
}
>>>>>>> 46837f51ce135bed7ff5ff20cc23e55bf0eac297
