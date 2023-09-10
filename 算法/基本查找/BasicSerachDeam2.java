package 基本查找;

import java.util.ArrayList;

public class BasicSerachDeam2 {
    public static void main(String[] args) {
        int[] arr = { 23, 67, 86, 23, 86, 41, 23, 22 };
        int num = 23;
        ArrayList<Integer> list = Serach(arr, num);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static ArrayList<Integer> Serach(int[] arr, int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int c = arr[i];
            if (c == number) {
                list.add(i);
            }
        }
        return list;
    }
}
