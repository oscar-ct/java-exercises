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

    public String[] addBorder(String[] picture) {
        List<String> list = new LinkedList<>();
        for (int i = 0; i < picture.length; i++) {
            picture[i] = "*" + picture[i] + "*";
            list.add(picture[i]);
        }
        String s = new String();
        for (int j = 0; j < picture[0].length(); j++) {
            s += "*";
        }
        list.add(0, s);
        list.add(picture.length + 1, s);
        System.out.println(list);
        return list.toArray(String[]::new);
    }

    public boolean areSimilar(int[] a, int[] b) {
        int count = 0;
        int sum = 1;
        int sum2 = 1;
        for (int i = 0; i < b.length; i++) {
            if (a[i] != b[i]) {
                count++;
                sum *= a[i];
                sum2 *= b[i];
            }
        }
        return count < 3 && sum == sum2;
    }
}
