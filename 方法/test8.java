package 方法;
public class test8 {
    public static void main(String[] args) {
        int[] arr = { 11, 22, 33, 44, 55 };
        System.out.print("[");
        shuZu(arr);
    }

    public static void shuZu(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i] + "]");
            }
        }
    }
}
