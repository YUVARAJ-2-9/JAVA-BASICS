import java.util.Arrays;

public class Remove {
    public static void main(String[] args) {
        int [] arr = {1,2,1,1,3,2,2};
        for (int i = 0; i < arr.length; i++) {
           boolean isSeen = false;
            for (int j = 0; j < i; j++) {
                if(arr[i] == arr[j]){
                    isSeen = true;
                    break;
                }
            }
             if(isSeen){
            continue;
            }
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] ==  arr[j]){
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
        
        }
        
    }
    

