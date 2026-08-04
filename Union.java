import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Union {
    public static void main(String[] args) {
        int [] a = {1,1,2,3,4,5};
        int [] a1 = {2,3,4,4,5,6};

        Set<Integer> st = new HashSet<>() ;
        for (int i = 0; i < a.length; i++) {
            st.add(a[i]);
        }
        for (int i = 0; i < a1.length; i++) {
            st.add(a1[i]);
        }
        int [] Union = new int [st.size()];
        int in = 0;
        for (int i : st) {
            Union[in++] = i;
        }
        System.out.println(Arrays.toString(Union));

    }
}
