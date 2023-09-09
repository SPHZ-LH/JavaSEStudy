import java.util.Scanner;
import java.util.StringJoiner;

public class ChangeLuoMa2 {
    public static void main(String[] args) {
        String str = input();
        String result = conversion(str);
        System.out.println(result);
    }

    public static String conversion(String str) {
        String[] arr = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        StringJoiner sj = new StringJoiner("--");
        for (int i = 0; i < str.length(); i++) {
            int numStr = str.charAt(i) - 48;
            sj.add(arr[numStr]);
        }
        String result = sj.toString();
        return result;
    }

    public static String input() {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个字符串");
            str = sc.next();
            if (str.length() <= 9) {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) > '0' && str.charAt(i) < '9') {
                        break;
                    } else {
                        System.out.println("输入的字符串无效");
                    }
                }
                break;
            } else {
                System.out.println("输入的字符串无效");
            }
        }
        return str;
    }
}