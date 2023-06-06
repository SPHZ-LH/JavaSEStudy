package 方法;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kind1 = sc.next();
        double speed1 = sc.nextInt();
        String color1 = sc.next();
        String kind2 = sc.next();
        double speed2 = sc.nextInt();
        String color2 = sc.next();
        Vehile1(kind1, speed1, color1);
        Vehile2(kind2, speed2, color2);
    }

    public static void Vehile1(String kind, Double speed, String color) {
        System.out.println("第一辆是" + kind + "，时速为" + speed + "km/h，颜色为" + color);
    }

    public static void Vehile2(String kind, Double speed, String color) {
        System.out.println("第二辆是" + kind + "，时速为" + speed + "km/h，颜色为" + color);
    }
}
