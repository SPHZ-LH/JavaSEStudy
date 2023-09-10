import java.util.Arrays;
import java.util.Comparator;

public class draft2 {
    public static void main(String[] args) {
        Integer[] arr = { 6, 7, 4, 8, 6, 8, 3, 4, 5 };
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return o1 - o2;
                // o1-o2 升序
                // o2-o1 降序
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
