package 基本查找;

public class BasicSerachDeam1 {
    public static void main(String[] args) {
        int[] arr = { 31, 24, 56, 83, 44, 22, 63 };
        int num = 44;
        int indax = Serach(arr, num);
        if (indax < 0) {
            System.out.println("不存在该数字");
        } else {
            System.out.println("该数据的索引为" + indax);
        }
    }

    public static int Serach(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
