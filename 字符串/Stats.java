import java.util.Scanner;

public class Stats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        int bigChar = 0;
        int smallChar = 0;
        int numChar = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                bigChar++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                smallChar++;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                numChar++;
            }
        }
        System.out.println("大写字母的个数为：" + bigChar);
        System.out.println("小写字母的个数为：" + smallChar);
        System.out.println("数字的个数为：" + numChar);
    }
}
