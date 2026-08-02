import java.util.Arrays;

public class Mul {
    public static void main(String[] args) {
        int [] [] [] mani = new int [2] [2] [2];
        for (int i = 0; i < mani.length; i++) {
            for (int j = 0; j < mani.length; j++) {
                for (int j2 = 0; j2 < mani.length; j2++) {
                    mani[i][j][j2] = i+j+j2;
                }
            }
        }

        System.out.println(Arrays.deepToString(mani));
    }
}
