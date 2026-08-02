class PrintName {
    public static void main(String[] args) {
        int n = 5;
        name(1, n);
    }

    static void name(int i,int n){
        if(i > n){
            return;
        }
        System.out.println("yuvi");
        name(i+1 ,n);
        
    }

}