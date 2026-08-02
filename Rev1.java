import java.util.Arrays;

public class Rev1 {
 public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60};
        rev(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void rev(int [] arr){
        int s = 0;
        int e = arr.length-1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;

        }
    }
    
} 