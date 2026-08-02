class Rev{
    public static void main(String[] args) {
        int n = 1313;
        rev(n);
    }
    public static int rev(int n){
        int rev = 0;
        int temp = n;
        while (temp > 0) {
            int ld = temp % 10;
            rev = (rev*10) + ld;
            temp /= 10;
     }
        System.out.println(rev);
        return n;
    }
}