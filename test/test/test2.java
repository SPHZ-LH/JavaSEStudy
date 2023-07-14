package test;

public class test2 {
    public static void main(String[] args) {
        /*
         * 输出所有的水仙花数。所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
         * 
         * 举例：153就是一个水仙花数。
         * 
         * 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
         * 
         */
        int ge, shi, bai, num;
        System.out.println("水仙花数");
        for (int i = 100; i < 999; i++) {
            ge = i % 10;
            shi = i / 10 % 10;
            bai = i / 10 / 10 % 10;
            num = ge * ge * ge + shi * shi * shi + bai * bai * bai;
            if (num == i) {
                System.out.println(num);
            }
        }
    }
}
