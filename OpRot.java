import java.util.Arrays;

public class OpRot {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int d = 3;
        d = d % n;
        rev(arr, 0, d - 1);
        rev(arr, d, n - 1);
        rev(arr, 0, n - 1);
       
    System.out.println("Left Rotated Array: " + Arrays.toString(arr));

    }
    static void rev(int [] arr,int s,int e){
        while (s < e) {
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }
    }
    
}