import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String Account = "zhangsan";
        String Password = "123456";

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入账号");
            String inputAccount = sc.next();
            System.out.println("请输入密码");
            String inputPassword = sc.next();
            if (inputAccount.equals(Account) && inputPassword.equals(Password)) {
                System.out.println("登入成功");
            } else if (i < 2) {
                System.out.println("账号或密码输入错误，还有" + (2 - i) + "次机会");
            } else {
                System.out.println("账号或密码输入错误，该账号已被锁定");
            }
        }
    }
}
