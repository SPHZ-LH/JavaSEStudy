package 作业;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankBusiness.welcome();
        BankBusiness account = new BankBusiness(sc.next(), sc.next());
        account.deposit(sc.next(), sc.nextDouble());
        account.withdraw(sc.next(), sc.nextDouble());
        account.withdraw(sc.next(), sc.nextDouble());
        account.withdraw(sc.next(), sc.nextDouble());
        BankBusiness.welcomeNext();
    }
}

class BankBusiness {
    public static String bankName = "中国银行";
    private String name;
    private String password;
    private double balance;// 余额

    public BankBusiness() {
    }

    public BankBusiness(String name, String password) {
        this.name = name;
        this.password = password;
        this.balance = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void welcome() {
        System.out.println(BankBusiness.bankName + "欢迎您的到来！");
    }

    public static void welcomeNext() {
        System.out.println("请收好您的证件和物品，欢迎您下次光临！");
    }

    public void deposit(String password, double number) {
        if (this.password.equals(password)) {
            this.balance = balance + number;
            System.out.println("您的余额有" + balance + "元。");
        } else {
            System.out.println("您的密码错误！");
        }
    }

    public void withdraw(String password, double number) {
        if (this.password.equals(password)) {
            if ((balance - number) < 0) {
                System.out.println("您的余额不足！");
            } else {
                System.out.println("请取走钞票，您的余额还有" + (balance - number) + "元。");
            }
        } else {
            System.out.println("您的密码错误！");
        }
    }
}