import java.util.Arrays;

public class Move {
    public static void main(String[] args) {
        int [] arr = {1,0,2};
        move(arr);

    }
    static void move(int [] arr){
        int l = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                int temp = arr[l];
                arr[l] = arr[i];
                arr[i] = temp;
                l++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
