public class Splicing {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        String result = inttostr(arr);
        System.out.println(result);
    }

    public static String inttostr(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                result = result + arr[i] + ",";
            } else {
                result = result + arr[i] + "]";
            }
        }
        return result;
    }
}
