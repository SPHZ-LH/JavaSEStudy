import java.util.Arrays;
import java.util.Comparator;

public class test1 {
    public static void main(String[] args) {
        Integer[] arr = { 7, 8, 6, 9, 5, 8, 9, 1, 8, 7, 6, 3, 4 };
        Arrays.sort(arr, (o1, o2) -> o1 - o2);
        System.out.println(Arrays.toString(arr));
    }
}
