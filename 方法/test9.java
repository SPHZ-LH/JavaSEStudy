package 方法;
public class test9 {
    public static void main(String[] args) {
        int[] arr = { 11, 22, 33, 44, 55 };
        int max = getMax(arr);
        System.out.println(max);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
