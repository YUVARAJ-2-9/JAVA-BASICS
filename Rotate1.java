class Rotate1{
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int k = 2;
        k = (i+2)%arr.length;
    }
    static int [] rot(int[]arr,,int s, int e){
        s = 0;
        e = arr.length-1;
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e++;
        }
    }
}