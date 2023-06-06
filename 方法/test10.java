package 方法;
public class test10 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7,8,9 };
        int[] copy2 = copy(arr, 2, 5);
        for (int i = 0; i < copy2.length; i++) {
            System.out.print(copy2[i] + " ");
        }
    }

    public static int[] copy(int[] arr, int form, int to) {
        int[] newArr = new int[to - form];
        int num = 0;
        for (int i = form; i < to; i++) {
            newArr[num] = arr[i-1];
            num++;

        }
        return newArr;

    }
}
