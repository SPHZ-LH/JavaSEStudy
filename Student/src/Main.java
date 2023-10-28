public class Main {
    public static void main(String[] args) {
        System.out.println("你看到的？");
        System.out.println("???????");
    }
}

class Account {
    private int id;
    private int balance;

    public Account() {
        this.id = 0;
        this.balance = 0;
    }

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    /**
     * 获取
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return balance
     */
    public int getBalance() {
        return balance;
    }

    /**
     * 设置
     *
     * @param balance
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean withdraw(int money) {
        if (balance < money) {
            return false;
        } else {
            this.balance = balance - money;
            return true;
        }
    }

    public void deposit(int money) {
        this.balance = balance + money;
    }

    public String toString() {
        return "Account{id = " + id + ", balance = " + balance + "}";
    }
}

class CheckingAccount extends Account {
    private int overdraft;

    public CheckingAccount() {
        super(0, 0);
        this.overdraft = 0;
    }

    public CheckingAccount(int id, int balance, int overdraft) {
        super(id, balance);
        this.overdraft = overdraft;
    }

    /**
     * 获取
     *
     * @return overdraft
     */
    public int getOverdraft() {
        return overdraft;
    }

    /**
     * 设置
     *
     * @param overdraft
     */
    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }

    public boolean withdraw(int money) {
        if (overdraft < money) {
            return false;
        } else {
            this.overdraft = overdraft - money;
            return true;
        }
    }

    public String toString() {
        return "CheckingAccount{overdraft = " + overdraft + "}";
    }
}
