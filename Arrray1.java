public class Arrray1 {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60};
        int n = arr.length;
        rev(arr,n);
    }
    static  int [] rev(int [] arr,int n){
        int s = 0;
        int e = arr.length-1;

        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
    }
}
