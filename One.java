/**
 * One
 */
public class One {

    public static void main(String[] args) {
        int n = 10;
        f(1,n);
    }
    static void f(int i,int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        f(i+1, n);
    }
}