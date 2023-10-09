import java.util.Scanner;

public class TestDeam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[5];
        System.out.println("请输入5个数：");
        for (int i = 0; i < data.length; i++) {
            try {
                System.out.println("余数结果是" + mod(sc.nextInt()));
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }

    public static int mod(int n) throws ArithmeticException {
        if (n == 0) {
            throw new ArithmeticException("除数不能为0");
        }
        return 100 % n;
    }
}