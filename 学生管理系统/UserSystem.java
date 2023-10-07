import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        loop: while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("1:登入");
            System.out.println("2:注册");
            System.out.println("3:忘记密码");
            System.out.println("4:退出");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入选项");
            String num = sc.next();
            switch (num) {
                case "1" -> addUser(list);
                case "2" -> enrUser(list);
                case "3" -> backUser(list);
                case "4" -> {
                    System.out.println("退出成功");
                    break loop;
                }
                default -> System.out.println("没有这个选项，请重新输入");
            }
        }
    }

    // 登入
    public static void addUser(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = sc.next();
        boolean nameFlag = contains(list, name);
        if (!nameFlag) {
            System.out.println("用户名不存在，请先注册");
            return;
        } else {
            int index = getIndex(list, name);
            User stu = list.get(index);
            String passaWord = stu.getPassword();
            for (int i = 0; i < 3; i++) {
                String getCaptcha = randNumber();
                System.out.println("请输入密码");
                String password = sc.next();
                System.out.println("请输入验证码:" + getCaptcha);
                String captcha = sc.next();
                if (passaWord.equals(password) && (getCaptcha.equalsIgnoreCase(captcha))) {
                    System.out.println("登入成功");
                    StudentSystem.startStudentSystem();
                    return;
                } else {
                    System.out.println("密码错误，请重新输入，还有" + (2 - i) + "次机会");
                }
            }
        }
    }

    // 注册
    public static void enrUser(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入3~15位，字母加数字的用户名");
        String username = sc.next();
        boolean antFlag = getAccount(list, username);
        if (!antFlag) {
            System.out.println("输入的用户名有误请重新输入");
            return;
        }
        String password;
        while (true) {
            System.out.println("请输入密码");
            password = sc.next();
            boolean pswFlag = getPassWord(password);
            if (!pswFlag) {
                continue;
            }
            break;
        }
        System.out.println("请输入身份证");
        String personid = sc.next();
        boolean psdFlag = getPersonid(personid);
        if (!psdFlag) {
            System.out.println("输入的身份证有误，请重新输入");
            return;
        }
        System.out.println("请输入手机号");
        String phooneNumber = sc.next();
        boolean phnFlag = getPhooneNumber(phooneNumber);
        if (!phnFlag) {
            System.out.println("输入的手机号有误，请重新输入");
            return;
        }
        User stu = new User(username, password, personid, phooneNumber);
        list.add(stu);
        System.out.println("用户注册成功");
    }

    // 忘记密码
    public static void backUser(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = sc.next();
        boolean flag = contains(list, name);
        if (!flag) {
            System.out.println("该用户名未注册");
            return;
        } else {
            int index = getIndex(list, name);
            User stu = list.get(index);
            String spersonid = stu.getPersonid();
            String sphooneNumber = stu.getPhooneNumber();
            System.out.println("请输入身份证号码");
            String personid = sc.next();
            System.out.println("请输入手机号码");
            String phooneNumber = sc.next();
            if ((spersonid.equals(personid)) && (sphooneNumber.equals(phooneNumber))) {
                while (true) {
                    System.out.println("请输入新的密码");
                    String password = sc.next();
                    boolean pswFlag = getPassWord(password);
                    if (pswFlag) {
                        stu.setPassword(password);
                        System.out.println("修改成功");
                        return;
                    }
                    continue;
                }
            } else {
                System.out.println("身份证或手机号码错误，修改失败");
            }
        }
    }

    public static boolean cycle(String username) {
        int bigChar = 0;
        int smallChar = 0;
        int numChar = 0;
        for (int i = 0; i < username.length(); i++) {
            char charUn = username.charAt(i);
            if (charUn >= 'a' && charUn <= 'z') {
                smallChar++;
            } else if (charUn >= 'A' && charUn <= 'Z') {
                bigChar++;
            } else if (charUn >= '0' && charUn <= '9') {
                numChar++;
            } else {
                return false;
            }
        }
        return ((bigChar + smallChar) > 0 && numChar > 0);
    }

    // 验证码
    public static String randNumber() {
        Random r = new Random();
        char[] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i < 26) {
                char charNum = (char) ('a' + i);
                arr[i] = charNum;
            } else if (i >= 26) {
                char charNum = (char) ('A' + i - 26);
                arr[i] = charNum;
            }
        }
        String result = "";
        for (int i = 0; i < 4; i++) {
            int number = r.nextInt(52);
            result = result + arr[number];
        }
        int numChar = r.nextInt(10);
        result = result + numChar;
        char[] newArr = result.toCharArray();
        char temp;
        for (int i = 0; i < newArr.length; i++) {
            int index = r.nextInt(newArr.length);
            temp = newArr[i];
            newArr[i] = newArr[index];
            newArr[index] = temp;
        }
        return result = new String(newArr);
    }

    // 账号
    public static boolean getAccount(ArrayList<User> list, String username) {
        boolean flag = contains(list, username);
        if (flag) {
            System.out.println("输入的用户名已经存在，请重新输入");
            return false;
        } else if (username.length() < 3 || username.length() > 15) {
            return false;
        } else {
            boolean strFlag = cycle(username);
            if (strFlag) {
                return true;
            } else {
                return false;
            }
        }
    }

    // 密码
    public static boolean getPassWord(String password) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请第二次输入密码");
        String psw = sc.next();
        if (psw.equals(password)) {
            return true;
        }
        System.out.println("两次密码输入错误，请重新输入");
        return false;
    }

    // 身份证
    public static boolean getPersonid(String personid) {
        int lenPsd = personid.length();
        if (lenPsd != 18) {
            return false;
        } else if (personid.charAt(0) == '0') {
            return false;
        } else {
            for (int i = 0; i < lenPsd - 1; i++) {
                char psdAt = personid.charAt(i);
                if (psdAt < '0' || psdAt > '9') {
                    return false;
                }
            }
            char charEnd = personid.charAt(lenPsd - 1);
            if ((charEnd >= '0' && charEnd <= '9') || charEnd == 'X' || charEnd == 'x') {
                return true;
            }
            return false;
        }
    }

    // 手机号
    public static boolean getPhooneNumber(String phooneNumber) {
        int lenPnb = phooneNumber.length();
        char charHm = phooneNumber.charAt(0);
        if (lenPnb != 11) {
            return false;
        } else if (charHm == '0') {
            return false;
        } else {
            for (int i = 0; i < lenPnb; i++) {
                char charPn = phooneNumber.charAt(i);
                if (charPn < '0' || charPn > '9') {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean contains(ArrayList<User> list, String username) {
        return getIndex(list, username) >= 0;
    }

    // 查询索引
    public static int getIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            String sue = user.getUsername();
            if (sue.equals(username)) {
                return i;
            }
        }
        return -1;
    }
}
