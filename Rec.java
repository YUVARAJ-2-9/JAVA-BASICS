public class Rec {
    public static void main(String[] args) {
        f();
    }
    static void f(){
        System.out.println("1");
        f();
    }
}
