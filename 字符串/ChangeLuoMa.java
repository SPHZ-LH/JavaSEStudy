import java.util.Scanner;
import java.util.StringJoiner;

public class ChangeLuoMa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        String result;
        while (true) {
            System.out.println("请输入一个数字");
            int num = sc.nextInt();
            if (num > 0 && num <= 999999999) {
                result = conversion(num);
                break;
            } else {
                System.out.println("输入的数字无效");
            }
        }
        System.out.println(result);
    }

    public static String conversion(int num) {
        String[] arr = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        StringJoiner sj = new StringJoiner("-");
        while (num != 0) {
            int ge = num % 10;
            sj.add(arr[ge]);
            num = num / 10;
        }
        String result = sj.toString();
        return result;
    }
}
