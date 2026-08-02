public class Rec1 {
    public static void main(String[] args) {
        rec1(0);  
        
    }
     int c = 0;
    static void rec1(int c){
         
        if(c == 3){
            return;
        }
        rec1(c + 1);
        System.out.println(c);
        
    }
}
