import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int [] arr = {3, 2, 2, 3};
        int tar = 3;
        move2(arr);

    }
    static void move(int [] arr){

        int l = 0;
        for (int r = 0; r < arr.length; r++) {
            if(arr[r] != 0){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    static void move1(int [] arr){
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                int temp = arr[l];
                arr[l] = arr[i];
                arr[i] = temp ;
                l++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
    static void move2(int [] arr){
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
    static void move3(int [] arr,int tar){
        int l = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != tar){
                arr[l] = arr[i];
                l++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}

