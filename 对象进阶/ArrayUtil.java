public class ArrayUtil {
    private ArrayUtil() {
    }

    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        return sb.toString();
    }

    public static double getAverage(Double[] arr) {
        double number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number + arr[i];
        }
        return number / arr.length;
    }
}
