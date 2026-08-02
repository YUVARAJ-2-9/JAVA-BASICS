public class N {
    public static void main(String[] args) {
        int n = 1;
        f(10,n);
    }
    static void f(int i ,int n){
        if(i < n){
            return;
        }
        System.out.println(i);
        f(i-1,n);
    }
}
