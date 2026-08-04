public class Sub2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
