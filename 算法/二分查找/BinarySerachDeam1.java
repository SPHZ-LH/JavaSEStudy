package 二分查找;

public class BinarySerachDeam1 {
    public static void main(String[] args) {
        int[] arr = { 12, 23, 34, 45, 56, 67, 78, 89, 90 };
        int num = 67;
        int index = Serach(arr, num);
        if (index < 0) {
            System.out.println("不存在该数字");
        } else {
            System.out.println("该数字的索引为" + index);
        }
    }

    public static int Serach(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;
        while (true) {
            int mid = (min + max) / 2;
            if (arr[mid] == number) {
                return mid;
            }
            if (arr[mid] < number) {
                min = mid + 1;
            } else if (number < arr[mid]) {
                max = mid - 1;
            }

            if (min > max) {
                return -1;
            }
        }
    }
}
