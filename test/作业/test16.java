package 作业;

public class test16 {
    public static void main(String[] args) {
        System.out.println("第一天共摘了" + eat(1) + "个桃子");
    }

    public static int eat(int a) {
        if (a == 10) {
            return 1;
        }

        return ((eat(a + 1) + 1) * 2);
    }
}
