import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= Math.sqrt(Number); i++) {
            if (Number % i == 0) {
                flag = true;
            }
        }
        System.out.println(flag);
    }
}
