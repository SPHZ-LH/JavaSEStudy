package 作业;
import java.util.Arrays;
import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < arr.length;) {
            try {
                String temp=sc.next();
				arr[i]=Integer.parseInt(temp);
                i++;
            } catch (NumberFormatException e) {
                System.out.println(e.toString());
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
