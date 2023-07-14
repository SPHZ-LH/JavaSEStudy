package test;

public class test22 {
    public static void main(String[] args) {
        String str = "1231242";
        String regex = "[1-9]\\d{0,9}";
        boolean flag = str.matches(regex);
        if (!flag) {
            System.out.println("不符合要求，请重兴输入");
        } else {
            int result = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                int num = c - '0';
                result = result * 10 + num;
            }
            System.out.println(str);
            System.out.println(result);
            System.out.println(result + 1);
        }
    }
}
