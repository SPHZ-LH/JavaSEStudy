package 作业;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sun1 = sc.nextInt();
        int sun2 = sc.nextInt();
        int max = Math.max(sun1, sun2);
        int min = Math.min(sun1, sun2);
        int result = 0;
        for (int i = min; i <= max; i++) {
            if (min % 2 == 1) {
                result = result + min;
            }
            min++;
        }
        System.out.println("SUM = " + result);
    }
}
