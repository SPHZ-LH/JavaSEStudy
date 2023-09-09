import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result;
        while (true) {
            System.out.println("请输入一个数字");
            int num = sc.nextInt();
            if (num < 0 || num > 9999999) {
                System.out.println("输入的数字无效");
            } else {
                result = Conver(num);
                break;
            }
        }
        System.out.println(mend(result));
    }

    public static String Conver(int num) {
        String[] strArr = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
        String result = "";
        while (num != 0) {
            int ge = num % 10;
            result = strArr[ge] + result;
            num = num / 10;
        }
        return result;
    }

    public static String mend(String result){
        int count =7-result.length();
        for (int i = 0; i < count; i++) {
            result="零"+result;
        }
        return result;
    }
}
