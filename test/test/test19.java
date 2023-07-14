package test;

public class test19 {
    public static void main(String[] args) {
        // 统计101~200之间的质数
        
        int moth = 0;
        for (int i = 101; i < 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println(i+"是质数");
                moth++;
            }
        }
        System.out.println(moth);
    }
}
