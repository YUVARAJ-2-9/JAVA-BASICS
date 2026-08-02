public class SumRec {
    public static void main(String[] args) {
        int n = 3;
        sum(1,n);
    }
    static int sum(int i ,int n, int add){
        if(n < i){
            System.out.println(add);
            return 1;
        }
        sum(i+1, n);
        
    }
}
