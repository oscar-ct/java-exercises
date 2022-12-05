import java.util.LinkedList;
import java.util.List;

public class ExploringTheWaters {
    public int[] alternatingSums(int[] a) {
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                sum += a[i];
            } else {
                sum2 += a[i];
            }
        }
        return new int[]{sum, sum2};
    }
}
