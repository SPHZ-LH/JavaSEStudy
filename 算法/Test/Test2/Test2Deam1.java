package Test.Test2;

public class Test2Deam1 {
    public static void main(String[] args) {
        // 方法一
        /*
         * int[] arr = new int[12];
         * arr[0] = 1;
         * arr[1] = 1;
         * for (int i = 2; i < arr.length; i++) {
         * arr[i] = arr[i - 1] + arr[i - 2];
         * }
         * System.out.println(arr[arr.length - 1]);
         */

        // 方法二
        int number = getNumber(12);
        System.out.println(number);
    }

    public static int getNumber(int moth) {
        if (moth == 1 || moth == 2) {
            return 1;
        }
        return getNumber(moth-1)+getNumber(moth-2);
    }
}
