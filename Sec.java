import java.util.Arrays;

public class Sec {
    public static void main(String[] args) {
        int [] arr = {3,2,1,5,2};
        sec(arr);

    }
    static void sec(int [] arr){
        int lar = arr[0];
        int sl = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > lar){
                sl = lar;
                lar = arr[i]; 
            }
            else if(arr[i] < lar && arr[i] > lar){
                sl = arr[i];
            }
        }
       System.out.println(sl + " ");
    }
}
